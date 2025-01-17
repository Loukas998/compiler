package Classes.GenericStatements.Variables;

import Classes.Values.ArrayInfoValue;
import Classes.VariableNaming;

import java.util.ArrayList;
import java.util.List;

public class ArrayDecl extends VariableAssignment{
    public VariableNaming variableNaming;
    public List<ArrayInfoValue> arrayInfoValues;

    public ArrayDecl(){
        this.arrayInfoValues = new ArrayList<>();
    }

    public ArrayDecl(VariableNaming variableNaming, List<ArrayInfoValue> arrayInfoValues) {
        this.variableNaming = variableNaming;
        this.arrayInfoValues = arrayInfoValues;
    }
    public void addArrayInfo(ArrayInfoValue aif){
        this.arrayInfoValues.add(aif);
    }
    @Override
    public String toString(){
        return "\n ArrayDecl {" +
                "\n arrayName: " + this.variableNaming.toString() +
                "\n , arrayValues: " + this.arrayInfoValues.toString() +
                "\n }";
    }
}
