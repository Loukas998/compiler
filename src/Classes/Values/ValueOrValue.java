package Classes.Values;

public class ValueOrValue extends ValueType{
    public ValueType firstValue;
    public String or;
    public ValueType secondValue;

    public ValueOrValue(){}

    public ValueOrValue(ValueType firstValue, ValueType secondValue, String or) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.or = or;
    }

    @Override
    public String toString(){
        return "first: " + firstValue.toString() + or + " second: " + secondValue.toString();
    }
}
