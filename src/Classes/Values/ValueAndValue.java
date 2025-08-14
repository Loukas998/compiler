package Classes.Values;

import java.io.FileWriter;

public class ValueAndValue extends  ValueType{
    public ValueType firstValue;
    public ValueType secondValue;

    public ValueAndValue(){}

    public ValueAndValue(ValueType firstValue, ValueType secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public String toString(){
        return "\n ValueAndValue {"+
                "\n FirstValue:" + firstValue.toString() +
                "\n, SecondValue: " + secondValue.toString()+
                "\n}";
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstValue.codeGen());

        sb.append("&&");
        sb.append(secondValue.codeGen());
        return sb.toString();
    }
}
