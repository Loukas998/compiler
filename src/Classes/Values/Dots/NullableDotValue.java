package Classes.Values.Dots;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class NullableDotValue extends ValueType {
    public ValueType firstValue;
    public ValueType secondValue;

    public NullableDotValue(){}

    public NullableDotValue(ValueType firstValue, ValueType secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString(){
        return "\n NullableDotValue{" +
                "\n FirstValue: " + firstValue +
                "\n, SecondValue: " + secondValue +
                "\n }";
    }
    public void codeGen(String s, FileWriter fw) {
        firstValue.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        sb.append("?.");
        secondValue.codeGen(s,fw);
    }
}
