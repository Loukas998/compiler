package Classes;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Class extends Expression{
    public String name;
    public List<GenericStatement> genericStatements;
    public Class() {
        this.genericStatements = new ArrayList<>();
    }
    public Class(List<GenericStatement> genericStatements) {
        this.genericStatements = genericStatements;
    }

    public void addGenericStatement(GenericStatement gs){
        genericStatements.add(gs);
    }

    @Override
    public String toString(){
        if(genericStatements != null){
            return "\n Class {"+
                    "\n GenericStatementList" + genericStatements.toString() +
                    "\n}";
        }
        return "";
    }
    public String codeGen(){
        StringBuilder sb = new StringBuilder();
        for (GenericStatement genericStatement : genericStatements) {
            sb.append(genericStatement.codeGen());
            sb.append("\n");
        }
        return sb.toString();
    }
}
