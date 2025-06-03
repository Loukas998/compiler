package Classes.GenericStatements.IfStatements;

import java.util.List;

public class ConditionalStatement extends ConditionalState {
    List<LogicalStatement> logicalStatements;
    List<LogicalOp> logicalOps;

    public ConditionalStatement() {
    }

    public ConditionalStatement(List<LogicalStatement> logicalStatements, List<LogicalOp> logicalOps) {
        this.logicalStatements = logicalStatements;
        this.logicalOps = logicalOps;
    }

    public void addLogicalStatements(LogicalStatement ls){
        logicalStatements.add(ls);
    }

    public void addLogicalOp(LogicalOp lo){
        logicalOps.add(lo);
    }

    @Override
    public String toString(){
        return "LogicalStatement: " ;
    }
}
