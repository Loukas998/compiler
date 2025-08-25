package Classes.CSS;

import java.util.ArrayList;
import java.util.List;

public class CssElement extends CssGeneric{
    // Dot* tagName? Comma? H4? selector* LeftBrace cssProperty* RightBrace

    public ArrayList<TagName> tagName = new ArrayList<>();
    public List<Selector> selector=new ArrayList<Selector>();
    public List<CssProperty> cssProperty=new ArrayList<CssProperty>();

    @Override
    public String toString() {
        if (tagName!=null){
            return "cssElement=" +
                    '\n'+"selectorName=" + tagName +
                    '\n'+"Properties=" + cssProperty + '\n'
                    ;
        }
        if (selector!=null){
            return "cssElement=" +
                    '\n'+"selector=" + selector +
                    '\n'+"Properties=" + cssProperty + '\n'
                    ;
        }
        return "cssElement=" +
                '\n'+"Properties=" + cssProperty + '\n'
                ;
    }
}