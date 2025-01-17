package Classes.Values.Simples;

import Classes.Values.ValueType;

public class DecimalNumberValue extends ValueType {
    public double decimalNumberValue;
    public DecimalNumberValue(){}

    public DecimalNumberValue(double decimalNumberValue) {
        this.decimalNumberValue = decimalNumberValue;
    }

    @Override
    public String toString(){
        return Double.toString(this.decimalNumberValue);
    }
}
