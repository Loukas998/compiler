package Classes.Values.Simples;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class DecimalNumberValue extends ValueType {
    public double decimalNumberValue;
    public DecimalNumberValue(){}

    public DecimalNumberValue(double decimalNumberValue) {
        this.decimalNumberValue = decimalNumberValue;
    }

    @Override
    public String toString(){
        return "NumberValue: " + this.decimalNumberValue;
    }
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(decimalNumberValue);
    }
}
