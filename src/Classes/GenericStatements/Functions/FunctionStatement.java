package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;
import Classes.VariableNaming;

import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends FunctionValue {
    public List<ValueType> params;
    public List<VariableNaming>paramVariableNames;
    public List<GenericStatement> genericStatements;
    public FunctionStatement(){
        this.params = new ArrayList<ValueType>();
        this.genericStatements = new ArrayList<GenericStatement>();
        this.paramVariableNames = new ArrayList<>();
    }
    public FunctionStatement(List<ValueType> variableNamings, List<GenericStatement> genericStatements) {
        this.params = variableNamings;
        this.genericStatements = genericStatements;
    }
    public void addVariableNamings(VariableNaming vn){
        paramVariableNames.add(vn);
    }
    public void addValueType(ValueType vn){
        params.add(vn);
    }

    public void addGenericStatements(GenericStatement gs){
        genericStatements.add(gs);
    }

    @Override
    public String toString(){
        return "\n FunctionStatement {" +
                "\n arguments: " + this.params.toString() +
                "\n arguments: " + this.paramVariableNames.toString() +
                "\n, genericStatements: " + this.genericStatements.toString() +
                "\n }";

    }
}
