package Classes.GenericStatements.IfStatements;

import Classes.GenericStatements.GenericStatement;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class If extends GenericStatement {
    public ConditionalState conditionalState;
    public List<GenericStatement> genericStatements;
    public If(){
        this.genericStatements = new ArrayList<>();
    }
    public If(ConditionalState conditionalState, List<GenericStatement> genericStatement){
        this.conditionalState = conditionalState;
        this.genericStatements = genericStatement;
    }

    public void addGenericStatements(GenericStatement gs){
        genericStatements.add(gs);
    }

    @Override
    public String toString(){
        return "If Statement ";//"Condition: " + conditionalState.toString() + " Statements: " + genericStatements.toString();
    }

    @Override
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("if (");
        this.conditionalState.codeGen(s,fw);
        sb.append(")");
    }
}
