package Classes;

import Classes.GenericStatements.GenericStatement;

import java.util.ArrayList;
import java.util.List;

public class Class extends Expression{
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
}
