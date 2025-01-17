package Classes.Values.Functions;

import Classes.Values.ValueType;

import java.util.ArrayList;
import java.util.List;

public class FunctionSummoning extends FunctionValue {
    public List<ValueType> arguments;
    public FunctionSummoning(){
        this.arguments = new ArrayList<>();
    }

    public FunctionSummoning(List<ValueType> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(ValueType arg){
        arguments.add(arg);
    }

    @Override
    public String toString(){
        return arguments.toString();
    }
}
