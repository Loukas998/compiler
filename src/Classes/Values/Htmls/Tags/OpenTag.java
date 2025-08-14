package Classes.Values.Htmls.Tags;

import Classes.Values.Htmls.HtmlTagValue;
import Classes.Values.Htmls.Tags.Attributes.Attribute;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class OpenTag extends HtmlTagValue {
    public String tagName;
    public List<Attribute> attributes;

    public OpenTag() {
        this.attributes = new ArrayList<>();
    }

    public OpenTag(String tagName, List<Attribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public void addAttribute(Attribute a){
        this.attributes.add(a);
    }

    @Override
    public String toString(){
        return "\n OpenTag{" +
                "\n tagName: " + this.tagName + "," +
                "\n attributes: " + this.attributes.toString() +
                "\n }"
                ;
    }

    @Override
    public String codeGen() {

        return "";
    }
}
