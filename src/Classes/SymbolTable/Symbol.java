package Classes.SymbolTable;

public class Symbol {
    public String type;
    public String value;
    public Scope scope;

    public String print(){
        return "\n Type : " +this.type.toString()
                + "        "  + "\n Value : " + this.value.toString();

    }
}
