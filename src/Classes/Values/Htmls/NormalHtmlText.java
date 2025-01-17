package Classes.Values.Htmls;

public class NormalHtmlText extends HtmlTagValue {
    public String htmlNormalText;
    public NormalHtmlText(){}
    public NormalHtmlText(String htmlNormalText){
        this.htmlNormalText = htmlNormalText;
    }

    @Override
    public String toString(){
        return htmlNormalText;
    }
}
