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
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append("var ");
        sb.append(this.variableNaming.codeGen());
        if(this.value !=null){
            sb.append(" = ");
            sb.append(this.value.codeGen());
        }
        sb.append("\n");
        return sb.toString();
    }
}
