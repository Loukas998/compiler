package Classes.CSS;

import java.util.ArrayList;
import java.util.List;

public class UnitNumberList extends DecimalLiteral_UNIT{
    //decimalLiteralUnit decimalLiteral*
  public  DecimalLiteralUnit decimalLiteralUnit;
    public List<Double>decimalLiteral=new ArrayList<Double>();

    public UnitNumberList() {
    }

    public UnitNumberList(DecimalLiteralUnit decimalLiteralUnit, List<Double> decimalLiteral) {
        this.decimalLiteralUnit = decimalLiteralUnit;
        this.decimalLiteral = decimalLiteral;
    }

    public DecimalLiteralUnit getDecimalLiteralUnit() {
        return decimalLiteralUnit;
    }

    public void setDecimalLiteralUnit(DecimalLiteralUnit decimalLiteralUnit) {
        this.decimalLiteralUnit = decimalLiteralUnit;
    }

    public List<Double> getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(List<Double> decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    @Override
    public String toString() {
        if (decimalLiteralUnit!=null){
            return "unitNumberList=" +
                    '\n'+"decimalLiteralUnit=" + decimalLiteralUnit ;
        }

            return "unitNumberList=" +
                    '\n'+"decimalLiteral=" + decimalLiteral ;


    }
}