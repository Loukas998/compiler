package Classes.Values;

public class BracedValue extends ValueType{
    public ValueType value;

    public BracedValue(ValueType value) {
        this.value = value;
    }

    public BracedValue() {
    }

    @Override
    public String toString() {
        return "\n Braced Value" + this.value.toString()+"\n";
    }

    @Override
    public String codeGen() {
        return "{" + this.value.codeGen()+"}";
    }
}
