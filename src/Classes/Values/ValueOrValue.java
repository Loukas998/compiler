package Classes.Values;

public class ValueOrValue extends ValueType{
    public ValueType firstValue;
    public ValueType secondValue;

    public ValueOrValue(){}

    public ValueOrValue(ValueType firstValue, ValueType secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString(){
        return "\n ValueOrValue {"+
                "\n FirstValue:" + firstValue.toString() +
                "\n, SecondValue: " + secondValue.toString()+
                "\n}";
    }
}
