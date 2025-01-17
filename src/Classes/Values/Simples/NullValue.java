package Classes.Values.Simples;

import Classes.Values.ValueType;

public class NullValue extends ValueType {
    public String isNull="null";

    public NullValue() {
        
    }
    @Override
    public String toString(){
        return isNull;
    }
}
