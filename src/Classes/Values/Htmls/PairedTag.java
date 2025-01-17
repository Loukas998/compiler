package Classes.Values.Htmls;

import Classes.Values.Htmls.Tags.CloseTag;
import Classes.Values.Htmls.Tags.OpenTag;

import java.util.ArrayList;
import java.util.List;

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
}
