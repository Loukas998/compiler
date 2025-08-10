package Classes.Values.Htmls;

import java.io.FileWriter;

public class NormalHtmlText extends HtmlTagValue {
    public String htmlNormalText;
    public NormalHtmlText(){}
    public NormalHtmlText(String htmlNormalText){
        this.htmlNormalText = htmlNormalText;
    }

    @Override
    public String toString(){
        return "\n NormalHtmlText {"+
                "\n text: " + this.htmlNormalText +
                "\n }";
    }

    @Override
    public void codeGen(String s, FileWriter fw) {

    }
}
