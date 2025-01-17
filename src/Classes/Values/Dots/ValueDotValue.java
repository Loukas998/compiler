package Classes.Values.Dots;

import Classes.Values.ValueType;

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
}
