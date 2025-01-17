package Classes.Values.Dots;

import Classes.Values.ValueType;

public class NullableDotValue extends ValueType {
    public ValueType firstValue;
    public String questionMarkDot;
    public ValueType secondValue;

    public NullableDotValue(){}

    public NullableDotValue(ValueType firstValue, ValueType secondValue, String questionMarkDot) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.questionMarkDot = questionMarkDot;
    }

    @Override
    public String toString(){
        return "first: " + firstValue.toString() + " " + questionMarkDot + " second: " + secondValue.toString();
    }
}
