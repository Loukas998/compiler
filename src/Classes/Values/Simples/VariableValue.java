package Classes.Values.Simples;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class  VariableValue extends ValueType {
    public String variableName;

    public VariableValue() {}

    public VariableValue(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString(){
        return this.variableName;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append(variableName);
        return sb.toString();
    }
}
