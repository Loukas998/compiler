package Classes.Values.Dots;

import Classes.Values.ValueType;

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
}
