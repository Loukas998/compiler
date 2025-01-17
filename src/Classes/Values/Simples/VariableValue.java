package Classes.Values.Simples;

import Classes.Values.ValueType;

public class VariableValue extends ValueType {
    public String variableName;

    public VariableValue() {}

    public VariableValue(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString(){
        return this.variableName;
    }
}
