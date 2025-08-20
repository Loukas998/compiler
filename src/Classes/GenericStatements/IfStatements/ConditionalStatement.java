package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement extends ConditionalState {
    List<LogicalStatement> logicalStatements;
    List<String>LogicalOps;
    List<GenericStatement> genericStatements;
    public ElseStatement elseStatement = new ElseStatement();

    public ConditionalStatement() {
        logicalStatements = new ArrayList<>();
        genericStatements = new ArrayList<>();
        LogicalOps = new ArrayList<>();
    }

    public ConditionalStatement(List<LogicalStatement> logicalStatements,
                                List<GenericStatement> genericStatements,
                                List<String>LogicalOps,
                                ElseStatement elseStatement) {
        this.logicalStatements = logicalStatements;
        this.genericStatements = genericStatements;
        this.LogicalOps = LogicalOps;
        this.elseStatement = elseStatement;
    }

    public void addLogicalStatements(LogicalStatement ls){
        logicalStatements.add(ls);
    }

    public void addGenericStatement(GenericStatement genState){
        genericStatements.add(genState);
    }
    public void addLogicalOp(String logicalOp){
        LogicalOps.add(logicalOp);
    }

    @Override
    public String toString(){
        return "LogicalStatement: " ;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (");
        for(int i  = 0;i<this.logicalStatements.size();i++){
            sb.append(this.logicalStatements.get(i).codeGen());
            if(i!=this.logicalStatements.size()-1){
                sb.append(this.LogicalOps.get(i));
            }
        }
        sb.append(")");
        sb.append("{");
        for(GenericStatement genericStatement : this.genericStatements){
            sb.append(genericStatement.codeGen());
        }
        sb.append("}");
        sb.append(elseStatement.codeGen());
        return sb.toString();
    }
}
