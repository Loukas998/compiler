package Classes.Values.Dots;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class ValueDotValue extends ValueType {
    public ValueType firstValue;
    public ValueType secondValue;

    public ValueDotValue(){}

    public ValueDotValue(ValueType firstValue, ValueType secondValue) {
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

    @Override
    public String  codeGen() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstValue.codeGen());
        stringBuilder.append(".");
        stringBuilder.append(secondValue.codeGen());
        stringBuilder.append("\n");
        return stringBuilder.toString();

    }
}
