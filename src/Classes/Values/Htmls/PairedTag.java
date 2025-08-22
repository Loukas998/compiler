package Classes.Values.Htmls;

import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.Attributes.NgFor;
import Classes.Values.Htmls.Tags.CloseTag;
import Classes.Values.Htmls.Tags.OpenTag;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
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
        StringBuilder sb = new StringBuilder();
        for(Attribute attribute:openTag.attributes){
            if(!(attribute instanceof NgFor)){
                continue;
            }
            if(attribute instanceof NgFor){
                return codeGenNgFor((NgFor) attribute);
            }
        }
        return "";
            }


            private String codeGenNgFor(NgFor ngFor){
        StringBuilder sb = new StringBuilder();
        sb.append("<div id=\"ngForSpecific").append(this.hashCode()).append("\" \n");
        sb.append("<script>\n");
        sb.append("const productList = document.getElementById('ngForSpecific'");
        sb.append("function renderProducts() {\n" +
                "    productList.innerHTML = \"\"; "+
                "\n" );
                sb.append(ngFor.plural);
                sb.append(".forEach((").append(ngFor.singular).append(",").append(ngFor.index);
                sb.append(") => { \n");
                sb.append(" const div = document.createElement(\"div\");\n" +
                        "div.className = \"side-product\";");
                sb.append(" div.addEventListener(\"click\", () => selectProduct(").append(ngFor.singular).append("))");
                


        sb.append("</div>");
        return "";
            }
}
