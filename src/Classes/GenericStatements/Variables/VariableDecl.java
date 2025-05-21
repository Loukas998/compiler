package Classes.GenericStatements.Variables;

import Classes.Values.ValueType;
import Classes.VariableNaming;

public class VariableDecl extends VariableAssignment{
    public VariableNaming variableNaming;
    public ValueType value;

    public VariableDecl(){}

    public VariableDecl(VariableNaming variableNaming, ValueType value){
        this.variableNaming = variableNaming;
        this.value = value;
    }

    @Override
    public String toString() {
        if (this.value != null) {
            return "\n VariableDecl {" +
                    "\n varName: " + this.variableNaming.toString() +
                    "\n , varValue: " + this.value.toString() +
                    "\n }";
        }
        return "\n VariableDecl {" +
                "\n varName: " + this.variableNaming.toString() ;
    }
}
