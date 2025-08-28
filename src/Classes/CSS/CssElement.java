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
                    '\n'+"selectorName=" + tagName.toString()+
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

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        for(TagName tagName1 : tagName){
            sb.append(tagName1.codeGen());
            sb.append(",");
        }
        if(tagName.size()>=1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        for(Selector select : selector){
            sb.append(select.codeGen()).append(" ");
        }
        sb.append("{");
        for(CssProperty prop : cssProperty){
            sb.append(prop.codeGen()).append(";\n");
        }
        sb.append("}");
        return sb.toString();

    }
}