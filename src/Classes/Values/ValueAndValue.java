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
    public void codeGen(String s, FileWriter fw) {
        firstValue.codeGen(s,fw);
        StringBuilder sb = new StringBuilder(s);
        sb.append("&&");
        secondValue.codeGen(s,fw);
    }
}
