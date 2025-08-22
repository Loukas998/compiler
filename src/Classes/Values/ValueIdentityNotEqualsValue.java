package Classes.Values;

public class ValueIdentityNotEqualsValue extends ValueType{
    public ValueType firstValue;
    public ValueType secondValue;

    public ValueIdentityNotEqualsValue(){}

    public ValueIdentityNotEqualsValue(ValueType firstValue, ValueType secondValue) {
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

    @Override
    public String codeGen() {
        return firstValue.codeGen() +
                "!==" +
                secondValue.codeGen();
    }
}
