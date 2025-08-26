package Classes.CSS;
public class CssValue extends CssGeneric{
    //decimalLiteral_UNIT|Row|Flex|Border_Box|Center|Column|Auto|Pointer|HEXCHAR|STRING
    public DecimalLiteral_UNIT decimalLiteral_UNIT;
    public String valueName;

    public DecimalLiteral_UNIT getDecimalLiteral_UNIT() {
        return decimalLiteral_UNIT;
    }

    public void setDecimalLiteral_UNIT(DecimalLiteral_UNIT decimalLiteral_UNIT) {
        this.decimalLiteral_UNIT = decimalLiteral_UNIT;
    }

    @Override
    public String toString() {
        if(decimalLiteral_UNIT !=null){
            return  '\n'+"decimalLiteral_UNIT="+decimalLiteral_UNIT.toString()+'\n'  ;
        }
        return "CssValue" +valueName;
    }

    @Override
    public String codeGen() {
        return "";
    }
}