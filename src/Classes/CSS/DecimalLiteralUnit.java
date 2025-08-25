package Classes.CSS;
public class DecimalLiteralUnit extends DecimalLiteral_UNIT {
    //DecimalLiteral_UNIT
    public String DecimalLiteral_UNIT;

    public String getDecimalLiteral_UNIT() {
        return DecimalLiteral_UNIT;
    }

    public void setDecimalLiteral_UNIT(String decimalLiteral_UNIT) {
        DecimalLiteral_UNIT = decimalLiteral_UNIT;
    }

    @Override
    public String toString() {
        return '\n'+"decimalLiteral_UNIT=" + DecimalLiteral_UNIT
                ;
    }
}