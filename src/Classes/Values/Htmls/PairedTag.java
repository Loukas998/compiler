package Classes.Values.Htmls;

import Classes.GenericStatements.IfStatements.LogicalStatement;
import Classes.Values.Htmls.Tags.Attributes.*;
import Classes.Values.Htmls.Tags.CloseTag;
import Classes.Values.Htmls.Tags.OpenTag;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PairedTag extends HtmlTagValue{
    public OpenTag openTag;
    public List<HtmlTagValue> htmlTags;
    public CloseTag closeTag;

    public PairedTag(OpenTag openTag, List<HtmlTagValue> htmlTags, CloseTag closeTag) {
        this.openTag = openTag;
        this.htmlTags = htmlTags;
        this.closeTag = closeTag;
    }

    public PairedTag() {
        htmlTags = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "\n PairedTag {"+
                "\n openTag: " + this.openTag.toString() + ","+
                "\n innerTags: " + this.htmlTags.toString() + ","+
                "\n closeTag: " + this.closeTag.toString() +
                "\n }";
    }

    @Override
    public String codeGen() {
        boolean hasInterpolation = false;
        boolean hasNgModel = false;
        String ngModelValue = "";
        boolean hasNgIf = false;
        boolean IdTaken = false;
        int propertyBindCount = 0;
        int eventBindCount = 0;
        String NgIfId = "";
        String conditionalVariable = "";
        LogicalStatement logicalStatement = null;
        ArrayList<String>propNames = new ArrayList<>();
        ArrayList<String>eventNames = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(Attribute attribute:openTag.attributes){
            if(attribute instanceof NgFor){
                return codeGenNgFor((NgFor) attribute);
            }
        }
        sb.append("<").append(openTag.tagName).append(" ");
        for (Attribute attribute:openTag.attributes){
            if(attribute instanceof NgFor)
                continue;
            if(!(attribute instanceof QuotedAttribute)){
                continue;
            }
            String attributeGen = attribute.codeGen();
            if(Objects.equals(((QuotedAttribute) attribute).attributeName, "routerLink")){
                sb.append("onClick = \"window.location.href='").append(((QuotedAttribute) attribute).attributeValue)
                        .append("'\"");
            }
            else {
                sb.append(attributeGen);
            }
            QuotedAttribute attribute1 = (QuotedAttribute) attribute;
            if(Objects.equals(attribute1.attributeName, "id")){
                NgIfId = attribute1.attributeValue;
                IdTaken = true;

            }
        }
        for(Attribute attribute: openTag.attributes) {
            if (attribute instanceof QuotedAttribute) {
                continue;
            }
            if (attribute instanceof NgIf) {
                hasNgIf = true;
                String codeGenerated = attribute.codeGen();
                if (!IdTaken) {
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
            else if(attribute instanceof EventBindingAttribute){
                eventBindCount++;
                eventNames.add(((EventBindingAttribute)attribute).attributeName);
                if(!IdTaken){
                    String eventId = attribute.codeGen();
                    sb.append(eventId);
                    NgIfId = eventId.replace("id = ", "");
                    IdTaken = true;
                }

            }
            else if (attribute instanceof NgModel){
                hasNgModel = true;
                ngModelValue = ((NgModel) attribute).assignedValue;
                String codeGenerated = attribute.codeGen();
                if(!IdTaken) {
                    sb.append(codeGenerated);
                    NgIfId = codeGenerated.replace("id = ","");
                    IdTaken = true;
                }
            }
            else {
                sb.append(attribute.codeGen());
            }
        }
        if(NgIfId.isEmpty()){
            NgIfId = this.openTag.tagName + this.openTag.hashCode();
            sb.append("id = \""+NgIfId+"\"");
        }
        sb.append("> \n");
        NgIfId = NgIfId.replace("\"","");
        if(hasNgModel) {
            ngModelValue = ngModelValue.replace("\"","");
            sb.append("<script>");
            sb.append("\n");
            sb.append("const ngmel = ");
            sb.append("document.getElementById('");
            sb.append(NgIfId);
            sb.append("') \n");
            sb.append("ngmel"+this.hashCode()+".value = ");
            sb.append(ngModelValue).append("\n");
            sb.append("ngmel.addEventListener(\"input\", e => { \n");
            sb.append(ngModelValue);
            sb.append(" = e.target.value; \n");
            sb.append(" }); \n");
            sb.append("setInterval(() => {\n" +
                    "if (document.activeElement !== ngmel"+this.hashCode()+" && ngmel"+this.hashCode()+".value !== ");
            sb.append(ngModelValue);
            sb.append(") { \n");
            sb.append("ngmel"+this.hashCode()+".value = ").append(ngModelValue);
            sb.append("\n } \n }, 100); \n");
            sb.append("</script>");
        }
        for(HtmlTagValue innerTag :htmlTags){
            if(innerTag instanceof HtmlInterpolation){
                continue;
            }
            sb.append("\n");
            sb.append(innerTag.codeGen());
            sb.append("\n");
        }
        sb.append(closeTag.codeGen());
        sb.append("<script>");
        sb.append("\n");
        sb.append("const el"+this.hashCode()+" = ");
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
            sb.append(" \n const originalDisplay = window.getComputedStyle(el"+this.hashCode()+").display; \n");
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
            sb.append("el"+this.hashCode()+".style.display = 'none';\n");
            sb.append("}");
            sb.append("\n else {");
            sb.append("el"+this.hashCode()+".style.display = originalDisplay; ");
            sb.append("} \n");

        }
        if(propertyBindCount>0){
            for(Attribute att : openTag.attributes){
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
                    sb.append("el"+this.hashCode()+".");
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
        if(eventBindCount>0){
            for(Attribute att: openTag.attributes){
                if(att instanceof EventBindingAttribute eba){
                    sb.append("document.addEventListener(\"").append(eba.attributeName);
                    sb.append("\", ()=>{ \n");
                    sb.append(eba.attributeValue).append("\n } \n");
                }
            }
        }

        sb.append("} \n");
        sb.append("setInterval(update_");
        sb.append(NgIfId);
        sb.append(",100)");
        sb.append("\n");
        sb.append("</script>");
        for(HtmlTagValue tagValue :htmlTags){
            if(!(tagValue instanceof HtmlInterpolation valueInter)){
                continue;
            }
            String[]separated = valueInter.codeGen().split("\n");
            ArrayList<String>interpolatedValues = new ArrayList<>(Arrays.asList(separated));
            sb.append("<script>\n");
            sb.append("const int").append(this.hashCode()).append("=");
            sb.append("document.getElementById('");
            sb.append(NgIfId);
            sb.append("') \n");
            for(int i =0;i<interpolatedValues.size();i++) {
                sb.append("let lastInter").append(this.hashCode()).append(i).append("= ''\n");
            }
            sb.append("function updateInter").append(this.hashCode());
            sb.append("(){\n");
            for(int i = 0;i<interpolatedValues.size();i++) {
                sb.append("let newInter").append(this.hashCode()).append(i);
                sb.append("= ");
                sb.append(interpolatedValues.get(i));
                sb.append("\n");
                sb.append("if (newInter");
                sb.append(this.hashCode()).append(i);
                sb.append("!== lastInter").append(this.hashCode()).append(i).append(")\n");
                sb.append("{\n");
                sb.append("newInter").append(this.hashCode()+i).append(i).append("="+interpolatedValues.get(i));
                sb.append("\n");
                sb.append("lastInter").append(this.hashCode()+i).append(i).append("="+interpolatedValues.get(i));
                sb.append("\n");
                sb.append("int"+this.hashCode()+".textContent = ").append(interpolatedValues.get(i));
                sb.append("\n");
                sb.append("}");
            }
            sb.append("}");
            sb.append("setInterval(updateInter").append(this.hashCode());
            sb.append(",100)");
            sb.append("</script>");

        }

        return sb.toString();
            }


            private String codeGenNgFor(NgFor ngFor){
        if(ngFor.index == null){
            ngFor.index = "i";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<div id=\"ngForSpecific").append(this.hashCode()).append("\" >\n");
        sb.append("<script>\n");
        sb.append("const productList = document.getElementById('ngForSpecific").append(this.hashCode()).append("')\n");
        sb.append("function renderProducts() {\n" +
                "    productList.innerHTML = \"\"; "+
                "\n" );
                sb.append(ngFor.plural);
                sb.append(".forEach((").append(ngFor.singular).append(",").append(ngFor.index);
                sb.append(") => { \n");
                sb.append(" const div = document.createElement(\"div\");\n" +
                        "div.className = \"side-product\";");
                sb.append(" div.addEventListener(\"click\", () => selectProduct(").append(ngFor.singular).append("))\n");
                sb.append("const h4 = document.createElement(\"h4\");\n" + "h4.textContent =")
                        .append(ngFor.singular)
                        .append(".name;\n")
                        .append("div.appendChild(h4);\n");
                sb.append("const img = document.createElement(\"img\");\n" + "img.src =")
                        .append(ngFor.singular)
                        .append(".image;\n")
                        .append("img.alt = \"صورة المنتج\";\n")
                        .append("img.className = \"product-image\";\n")
                        .append("div.appendChild(img);");
                sb.append("const btn = document.createElement(\"button\");\n" + "btn.className = \"delete-button\";\n" + "btn.textContent = \"Delete\";\n" +
                                "btn.addEventListener(\"click\", (event) => {\n" + "event.stopPropagation();\n" + "deleteProduct(")
                        .append(ngFor.index).append(");\n")
                        .append("renderProducts();\n")
                        .append("});\n")
                        .append("div.appendChild(btn);\n")
                        .append("\n").append("\n").append("productList.appendChild(div);\n").append("})};");
                sb.append("document.addEventListener(\"DOMContentLoaded\",renderProducts)");
                sb.append("</script>");
        sb.append("</div>");
        return sb.toString();
            }
}
