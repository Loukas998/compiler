package Classes.GenericStatements.Functions;

import Classes.GenericStatements.GenericStatement;
import Classes.Values.ValueType;

import java.io.FileWriter;

public class Function extends ValueType {
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

    @Override
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        if(functionName.equals("ngOnInit")){
            sb.append("init");

        }
        else{
            sb.append(functionName);
        }
        functionStatement.codeGen(s,fw);
    }
}
