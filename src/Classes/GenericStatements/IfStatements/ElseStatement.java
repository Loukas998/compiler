package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.util.ArrayList;
import java.util.List;

public class ElseStatement {
    public List<GenericStatement> genericStatementList = new ArrayList<>();

    public ElseStatement() {

    }

    public ElseStatement(List<GenericStatement> genericStatementList) {
        this.genericStatementList = genericStatementList;
    }

    @Override
    public String toString() {
        StringBuilder retString = new StringBuilder("\n Else Statement \n");
        for(GenericStatement genericStatement:genericStatementList){
            retString.append(genericStatement.toString());
            retString.append("\n");
        }
        return retString.toString();

    }
    public String codeGen(){
        StringBuilder sb = new StringBuilder();
        sb.append("else { ");
        sb.append("\n");
        for (GenericStatement genericStatement: genericStatementList){
            sb.append(genericStatement.codeGen());
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
