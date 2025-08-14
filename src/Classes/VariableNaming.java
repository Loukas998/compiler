package Classes;

import java.io.FileWriter;

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
            return " VariableNaming {" +
                    "\n VariableName: " +//+ this.name +
                    "\n , VariableType: " ;//+ this.type.toString() +
                    //"\n}";
        }
        return "\n VariableNaming {" +
                "\n VariableName: " + //this.name +
                "\n}";
    }
    public String codeGen(){
        return this.name;
    }
}
