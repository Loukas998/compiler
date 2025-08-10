package Classes.Values;

import java.io.FileWriter;

public class NullableValue extends ValueType{
    public ValueType nullableValue;

    public NullableValue() {
    }

    public NullableValue(ValueType nullableValue) {
        this.nullableValue = nullableValue;
    }

    @Override
    public String toString(){
        return "\n NullableValue{" +
                "\n value: " + this.nullableValue.toString() +
                "\n }";
    }

    @Override
    public void codeGen(String s, FileWriter fw) {
        nullableValue.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        sb.append("?");
    }
}
