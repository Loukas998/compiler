package Classes.CSS;


import org.stringtemplate.v4.ST;

public class TagName extends CssGeneric{
    //H1| H2| H3| H4| IMG_| P| QuestionDot| RBRACE_RBRACE| LBRACE_LBRACE| Div_| Dot| Button
    public String tagName;

    public TagName() {
    }

    public TagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString(){
        return tagName;
    }

    @Override
    public String codeGen() {
        return "";
    }
}
