package Classes.GenericStatements.IfStatements;

public class VariableName extends ConditionalState {
    public String variableName;
    public VariableName(){}
    public VariableName(String logicalOp){
        this.variableName = logicalOp;
    }
    @Override
    public String toString(){
        //return this.variableName;
        return "VariableName ";
    }
}
