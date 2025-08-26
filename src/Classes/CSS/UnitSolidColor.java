package Classes.CSS;

public class UnitSolidColor extends DecimalLiteral_UNIT{
    //decimalLiteralUnit Solid HEXCHAR
   public String Solid;
    public String HEXCHAR;
    public DecimalLiteralUnit decimalLiteralUnit;

    public String getSolid() {
        return Solid;
    }

    public void setSolid(String solid) {
        Solid = solid;
    }

    public String getHEXCHAR() {
        return HEXCHAR;
    }

    public void setHEXCHAR(String HEXCHAR) {
        this.HEXCHAR = HEXCHAR;
    }

    public DecimalLiteralUnit getDecimalLiteralUnit() {
        return decimalLiteralUnit;
    }

    public void setDecimalLiteralUnit(DecimalLiteralUnit decimalLiteralUnit) {
        this.decimalLiteralUnit = decimalLiteralUnit;
    }

    @Override
    public String toString() {
        return "UnitSolidColor=" +
                "Solid=" + Solid + '\'' +
                "HEXCHAR=" + HEXCHAR + '\'' +
                "decimalLiteralUnit=" + decimalLiteralUnit
                ;
    }

    @Override
    public String codeGen() {
        return "";
    }
}
