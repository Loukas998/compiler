package Classes.GenericStatements.Variables;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;
import Classes.VariableNaming;

import java.io.FileWriter;

public class VariableDecl extends GenericStatement {
    public VariableNaming variableNaming;
    public ValueType value;

    public VariableDecl(){}

    public VariableDecl(VariableNaming variableNaming, ValueType value){
        this.variableNaming = variableNaming;
        this.value = value;
    }

    @Override
    public String toString() {
        if (this.value != null) {
            return "\n VariableDecl {" +
                    "\n varName: " + this.variableNaming.toString() +
                    "\n , varValue: " + this.value.toString() +
                    "\n }";
        }
        return "\n VariableDecl {" +
                "\n varName: " + this.variableNaming.toString() ;
    }

    @Override
    public void codeGen(String s, FileWriter fw) {
        this.variableNaming.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        if(this.value !=null){
            sb.append(" = ");
            this.value.codeGen(s,fw);
        }
    }
}
