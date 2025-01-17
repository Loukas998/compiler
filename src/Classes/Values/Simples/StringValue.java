package Classes.Values.Simples;

import Classes.Values.ValueType;

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
}
