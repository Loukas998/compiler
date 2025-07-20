package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;

public class Function extends GenericStatement {
    public String functionName;
    public FunctionStatement functionStatement;
    public Function(){}
    public Function(String functionName, FunctionStatement functionStatement){
        this.functionName = functionName;
        this.functionStatement = functionStatement;
    }

    @Override
    public String toString(){
        return "\n Function {" +
                "\n functionName: " + this.functionName +
                "\n functionStatement: " + this.functionStatement+
                "\n }";
    }
}
