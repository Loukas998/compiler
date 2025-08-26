package Classes.CSS;

import java.util.ArrayList;
import java.util.List;

public class Selector extends CssGeneric{
    //STRING IMG_? selectorInternal*
   public String STRING;
    public List<SelectorInternal> selectorInternal=new ArrayList< SelectorInternal>();
    public String Textarea;

    public List<SelectorInternal> getSelectorInternal() {
        return selectorInternal;
    }

    public void setSelectorInternal(List<SelectorInternal> selectorInternal) {
        this.selectorInternal = selectorInternal;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public String getTextarea() {
        return Textarea;
    }

    public void setTextarea(String textarea) {
        Textarea = textarea;
    }

    @Override
    public String toString() {
        if (selectorInternal!=null&&!selectorInternal.isEmpty()){
          return  '\n'+"selectorName="+STRING+
          '\n'+"selectorInternal=" + selectorInternal +'\n'
          ;
        }
        return  '\n'+"selectorName="+STRING+'\n'

                ;
    }

    @Override
    public String codeGen() {
        return "";
    }
}