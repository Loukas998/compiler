package Classes.Values.Htmls.Tags;

import Classes.Values.Htmls.HtmlTagValue;

import java.io.FileWriter;

public class CloseTag extends HtmlTagValue {
    public String tagName;
    public CloseTag(){}
    public CloseTag(String tagName){
        this.tagName = tagName;
    }
    @Override
    public String toString(){
        return "CloseTag: " + tagName;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("</");
        sb.append(tagName);
        sb.append(">");
        return sb.toString();
    }
}
