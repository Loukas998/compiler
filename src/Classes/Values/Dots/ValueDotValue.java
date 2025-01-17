package Classes.Values.Dots;

import Classes.Values.ValueType;

public class ValueDotValue extends ValueType {
    public ValueType firstValue;
    public String dot;
    public ValueType secondValue;

    public ValueDotValue(){}

    public ValueDotValue(String dot, ValueType firstValue, ValueType secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.dot = dot;
    }

    @Override
    public String toString(){
        return "first: " + firstValue.toString() + " " + dot + " second: " + secondValue.toString();
    }
}
