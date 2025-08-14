package Classes.Values.Simples;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class NullValue extends ValueType {
    public String isNull="null";

    public NullValue() {
        
    }
    @Override
    public String toString(){
        return isNull;
    }

    @Override
    public String codeGen() {
        return isNull;
    }
}
