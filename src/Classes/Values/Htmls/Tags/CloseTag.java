package Classes.Values.Htmls.Tags;

import Classes.Values.Htmls.HtmlTagValue;

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
}
