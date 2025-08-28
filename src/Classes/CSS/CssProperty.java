package Classes.CSS;

import java.util.ArrayList;
import java.util.List;

public class CssProperty extends CssGeneric{
    //css Colon cssValue operators
    Css css;
    public List<CssValue> cssValue=new ArrayList<CssValue>();

    public Css getCss() {
        return css;
    }

    public void setCss(Css css) {
        this.css = css;
    }

    public List<CssValue> getCssValue() {
        return cssValue;
    }

    public void setCssValue(List<CssValue> cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return  '\n'+"property=" + css
                ;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append(css.codeGen());
        sb.append(":");
        for(CssValue cssValue1 :cssValue){
            sb.append(cssValue1.codeGen()).append(" ");
        }
        return sb.toString();
    }
}