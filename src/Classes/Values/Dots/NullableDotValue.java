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
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstValue.codeGen());
        sb.append("?.");;
        sb.append(secondValue.codeGen());
        return sb.toString();
    }
}
