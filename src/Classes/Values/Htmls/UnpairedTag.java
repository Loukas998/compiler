package Classes.Values.Htmls;

import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.Attributes.NgIf;
import Classes.Values.Htmls.Tags.Attributes.PropertyBindAttribute;
import Classes.Values.Htmls.Tags.Attributes.QuotedAttribute;
import Classes.Values.Htmls.Tags.OpenTag;
import org.w3c.dom.Attr;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        boolean IdTaken = false;
        int propertyBindCount = 0;
       // ArrayList<String>propertyIds = new ArrayList<String>();
        String NgIfId = "";
        String conditionalVariable = "";
        LogicalStatement logicalStatement = null;
        ArrayList<String>propNames = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(tagName);
        sb.append(" ");
        for (Attribute attribute:attributes){
            if(!(attribute instanceof QuotedAttribute)){
                continue;
            }
            sb.append(attribute.codeGen());
            QuotedAttribute attribute1 = (QuotedAttribute) attribute;
            if(Objects.equals(attribute1.attributeName, "id")){
                NgIfId = attribute1.attributeValue;
                IdTaken = true;
            }
        }
        for(Attribute attribute:attributes) {
            if(attribute instanceof QuotedAttribute){
                continue;
            }
            if (attribute instanceof NgIf) {
                hasNgIf = true;
                String codeGenerated = attribute.codeGen();
                if(!IdTaken){
                    sb.append(codeGenerated);
                    NgIfId = codeGenerated.replace("id = ", "");
                    IdTaken = true;
                }

                sb.append(" ");
                NgIf cond = (NgIf) attribute;
                if (cond.conditionalVariable != null) {
                    conditionalVariable = cond.conditionalVariable;
                }
                if (cond.logicalStatement != null) {
                    logicalStatement = cond.logicalStatement;
                }
            }
            else if(attribute instanceof PropertyBindAttribute){
                propertyBindCount++;
                propNames.add(((PropertyBindAttribute) attribute).attributeName);
                if(!IdTaken){
                    String propertyId = attribute.codeGen();
                    sb.append(propertyId);
                   NgIfId = propertyId.replace("id = ", "");
                   IdTaken = true;

                }
            }
            else {
                sb.append(attribute.codeGen());
            }
        }
            sb.append("/> \n");
        NgIfId = NgIfId.replace("\"","");
        sb.append("<script>");
        sb.append("\n");
        sb.append("const el = ");
        sb.append("document.getElementById('");
        sb.append(NgIfId);
        sb.append("') \n");
        if(!propNames.isEmpty()){
            for (String propName : propNames) {
                sb.append("let last");
                sb.append(propName);
                sb.append(" = ''");
                sb.append("\n");
            }
        }
        if(hasNgIf) {
            sb.append(" \n const originalDisplay = window.getComputedStyle(el).display; \n");
        }
        sb.append("function update_");
        sb.append(NgIfId);
        sb.append("() \n");
        sb.append("{");
        sb.append("\n");
            if(hasNgIf){
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

            }
            if(propertyBindCount>0){
                for(Attribute att : attributes){
                    if(att instanceof  PropertyBindAttribute){
                        PropertyBindAttribute prat = (PropertyBindAttribute)att;
                        prat.attributeValue = prat.attributeValue.replace("\"","");
                        sb.append("const new");
                        sb.append(prat.attributeName);
                        sb.append( "= ");
                        sb.append(prat.attributeValue);
                        sb.append("\n");
                        sb.append("if (new");
                        sb.append(prat.attributeName);
                        sb.append("!== last");
                        sb.append(prat.attributeName);
                        sb.append(") \n");
                        sb.append("{");
                        sb.append("el.");
                        sb.append(((PropertyBindAttribute) att).attributeName);
                        sb.append(" = ");
                        sb.append(prat.attributeValue.replace("\"",""));
                        sb.append("\n");
                        sb.append("last");
                        sb.append(((PropertyBindAttribute) att).attributeName);
                        sb.append(" = ");
                        sb.append(prat.attributeValue.replace("\"",""));
                        sb.append("\n");
                        sb.append("}");
                    }
                }
            }

        sb.append("} \n");
        sb.append("setInterval(update_");
        sb.append(NgIfId);
        sb.append(",100)");
        sb.append("\n");
        sb.append("</script>");
        return sb.toString();

    }
}
