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
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("</");
        sb.append(tagName);
        sb.append(">");
    }
}
