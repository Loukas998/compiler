package Classes.Values.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;
import Classes.VariableNaming;

import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends FunctionValue {
    public List<VariableNaming> variableNamings;
    public List<GenericStatement> genericStatements;
    public FunctionStatement(){
        this.variableNamings = new ArrayList<>();
        this.genericStatements = new ArrayList<>();
    }
    public FunctionStatement(List<VariableNaming> variableNamings, List<GenericStatement> genericStatements) {
        this.variableNamings = variableNamings;
        this.genericStatements = genericStatements;
    }
    public void addVariableNamings(VariableNaming vn){
        variableNamings.add(vn);
    }

    public void addGenericStatements(GenericStatement gs){
        genericStatements.add(gs);
    }

    @Override
    public String toString(){
        return "\n FunctionStatement {" +
                "\n arguments: " + this.variableNamings.toString() +
                "\n, genericStatements: " + this.genericStatements.toString() +
                "\n }";

    }
}
