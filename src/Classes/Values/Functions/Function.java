package Classes.Values.Functions;

public class Function extends FunctionValue {
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
