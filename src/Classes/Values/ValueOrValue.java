package Classes.Values;

import java.io.FileWriter;

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

    @Override
    public void codeGen(String s, FileWriter fw) {
        firstValue.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        sb.append("||");
        secondValue.codeGen(s,fw);
    }
}
