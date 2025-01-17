package Classes.Values.Htmls;

import Classes.Values.Htmls.Tags.Attributes.Attribute;
import Classes.Values.Htmls.Tags.OpenTag;

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
}
