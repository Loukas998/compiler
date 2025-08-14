package Classes.Values.Simples;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class StringValue extends ValueType {
    public String stringValue;
    public StringValue(){}
    public StringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    @Override
    public String toString(){
        return "StringValue: " + stringValue;
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append(stringValue);
        return sb.toString();
    }
}
