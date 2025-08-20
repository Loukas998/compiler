package Classes.GenericStatements.Variables;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ArrayInfoValue;
import Classes.VariableNaming;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayDecl extends GenericStatement {
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

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("var ");
        sb.append(this.variableNaming.codeGen());
        if(this.arrayInfoValues!=null && !this.arrayInfoValues.isEmpty()){
            sb.append(" = ");
        }
        for(ArrayInfoValue arrVal : arrayInfoValues){

            sb.append(arrVal.codeGen());
            sb.append("\n");
        }
        return sb.toString();
    }
}
