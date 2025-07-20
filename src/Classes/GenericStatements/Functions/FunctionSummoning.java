package Classes.GenericStatements.Functions;

import Classes.Values.ValueType;

import java.util.ArrayList;
import java.util.List;

public class FunctionSummoning extends FunctionValue {
    public String functionName;
    public List<ValueType> arguments;
    public FunctionSummoning(){
        this.arguments = new ArrayList<>();
    }

    public FunctionSummoning(List<ValueType> arguments, String functionName) {
        this.arguments = arguments;
        this.functionName = functionName;
    }

    public void addArgument(ValueType arg){
        arguments.add(arg);
    }

    @Override
    public String toString(){
        return "\n FunctionSummoning {"+
                "\n functionName: " + this.functionName +
                "\n arguments: " + this.arguments.toString() +
                "\n }";
    }
}
