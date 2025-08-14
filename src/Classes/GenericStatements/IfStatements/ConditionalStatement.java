package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement extends ConditionalState {
    List<LogicalStatement> logicalStatements;
    List<GenericStatement> genericStatements;

    public ConditionalStatement() {
        logicalStatements = new ArrayList<>();
        genericStatements = new ArrayList<>();
    }

    public ConditionalStatement(List<LogicalStatement> logicalStatements, List<GenericStatement> genericStatements) {
        this.logicalStatements = logicalStatements;
        this.genericStatements = genericStatements;
    }

    public void addLogicalStatements(LogicalStatement ls){
        logicalStatements.add(ls);
    }

    public void addGenericStatement(GenericStatement genState){
        genericStatements.add(genState);
    }

    @Override
    public String toString(){
        return "LogicalStatement: " ;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (");
        for(LogicalStatement logicalStatement : this.logicalStatements){
            sb.append(logicalStatement.codeGen());
        }
        sb.append(")");
        sb.append("{");
        for(GenericStatement genericStatement : this.genericStatements){
            sb.append(genericStatement.codeGen());
        }
        sb.append("}");
        return sb.toString();
    }
}
