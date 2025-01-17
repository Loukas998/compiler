package Classes.Values;

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
}
