package Classes.CSS;
public class SelectorInternal extends CssGeneric {
    //Colon? STRING
    String STRING;

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        return '\n'+ STRING + '\n'
                ;
    }

    @Override
    public String codeGen() {
        return STRING;
    }
}