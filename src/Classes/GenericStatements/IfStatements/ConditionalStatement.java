package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;
import java.util.List;

public class ConditionalStatement extends ConditionalState {
    List<LogicalStatement> logicalStatements;
    List<GenericStatement> genericStatements;

    public ConditionalStatement() {
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
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("if (");
        for(LogicalStatement logicalStatement : this.logicalStatements){
            logicalStatement.codeGen(s,fw);
        }
        sb.append(")");
        sb.append("{");
        for(GenericStatement genericStatement : this.genericStatements){
            genericStatement.codeGen(s,fw);
        }
        sb.append("}");

    }
}
