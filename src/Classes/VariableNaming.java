package Classes;

public class VariableNaming {
    public VarType type;
    public String name;
    public VariableNaming(){

    }
    public VariableNaming(VarType type,String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        if(this.type!=null){
            return this.name + ":" + this.type.toString();
        }
        return this.name;
    }
}
