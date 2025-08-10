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
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(stringValue);
    }
}
