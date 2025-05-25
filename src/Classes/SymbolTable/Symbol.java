package Classes.SymbolTable;

public class Symbol {
    public String type;
    public Object value;
    public Scope scope;

    public String print(){
        return "\n Type : " + this.type + "\n"
                + "        "  + "\n Value : " + this.value.toString()+"\n";

    }
}
