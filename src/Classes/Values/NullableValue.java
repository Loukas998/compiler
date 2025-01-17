package Classes.Values;

public class NullableValue extends ValueType{
    public ValueType nullableValue;
    public String questionMark;

    public NullableValue() {
    }

    public NullableValue(ValueType nullableValue, String questionMark) {
        this.nullableValue = nullableValue;
        this.questionMark = questionMark;
    }

    @Override
    public String toString(){
        return "nullable: " + nullableValue.toString() + questionMark;
    }
}
