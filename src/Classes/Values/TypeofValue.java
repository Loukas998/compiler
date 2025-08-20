package Classes.Values;

public class TypeofValue extends ValueType{
    public ValueType valueType;

    public TypeofValue() {
    }

    public TypeofValue(ValueType valueType) {
        this.valueType = valueType;
    }

    @Override
    public String toString() {
       return "\n Type of Value" +
              "\n" + this.valueType.toString();

    }

    @Override
    public String codeGen() {
        return "typeof " +
                valueType.codeGen();
    }
}
