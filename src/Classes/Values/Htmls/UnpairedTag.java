package Classes.Values.Htmls;

import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.Attributes.NgIf;
import Classes.Values.Htmls.Tags.OpenTag;
import org.w3c.dom.Attr;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UnpairedTag extends HtmlTagValue {
    public String tagName;
    public List<Attribute> attributes;

    public UnpairedTag() {
        this.attributes = new ArrayList<>();
    }

    public UnpairedTag(String tagName, List<Attribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public void addAttribute(Attribute a){
        this.attributes.add(a);
    }

    @Override
    public String toString(){
        return "\n UnpairedTag {" +
                "\n tagName: " + this.tagName + "," +
                "\n attributes: " + this.attributes.toString() +
                "\n }";
    }

    @Override
    public String codeGen() {
        boolean hasNgIf = false;
        String NgIfId = "";
        String conditionalVariable = "";
        LogicalStatement logicalStatement = null;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(tagName);
        sb.append(" ");
        for(Attribute attribute:attributes) {
            if (attribute instanceof NgIf) {
                hasNgIf = true;
                String codeGenerated = attribute.codeGen();
                sb.append(codeGenerated);
                sb.append(" ");
                NgIfId = codeGenerated.replace("id = ", "");
                NgIf cond = (NgIf) attribute;
                if (cond.conditionalVariable != null) {
                    conditionalVariable = cond.conditionalVariable;
                }
                if (cond.logicalStatement != null) {
                    logicalStatement = cond.logicalStatement;
                }
            } else {
                sb.append(attribute.codeGen());
            }
        }
            sb.append("/>");
            if(hasNgIf){
                NgIfId = NgIfId.replace("\"","");
                sb.append("<script>");
                sb.append("\n");
                sb.append("const el = ");
                sb.append("document.getElementById('");
                sb.append(NgIfId);
                sb.append("')");
                sb.append(" \n const originalDisplay = window.getComputedStyle(el).display; \n");

                sb.append("function update_");
                sb.append(NgIfId);
                sb.append("() \n");
                sb.append("{");
                sb.append("\n");
                sb.append("if (!(");
                if(!conditionalVariable.isEmpty()){
                    sb.append(conditionalVariable);
                }
//                else if(logicalStatement!=null){
//
//                }
                sb.append("))");
                sb.append("{ \n");
                sb.append("el.style.display = 'none';\n");
                sb.append("}");
                sb.append("\n else {");
                sb.append("el.style.display = originalDisplay; ");
                sb.append("} \n");
                sb.append("} \n");
                sb.append("setInterval(update_");
                sb.append(NgIfId);
                sb.append(",100)");
                sb.append("\n");
                sb.append("</script>");
            }

        return sb.toString();

    }
}
