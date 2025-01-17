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
    public String toString(){
        return "Variable: " + variableNaming.name + ", Value: " + value.toString();
    }
}
