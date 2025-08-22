package Classes.Values.Htmls;

import Classes.Values.ValueType;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class HtmlInterpolation extends HtmlTagValue{
    public List<ValueType> valueTypes;
    public HtmlInterpolation(){
        this.valueTypes = new ArrayList<>();
    }

    public HtmlInterpolation(List<ValueType> valueTypes){
        this.valueTypes = valueTypes;
    }

    @Override
    public String toString(){
        return "\n HtmlInterpolations {"+
                "\n interpolationValues: " + this.valueTypes.toString() +
                "\n }";
    }

    @Override
    public String codeGen() {
        StringBuilder sb = new StringBuilder();
        for(ValueType interpolated:valueTypes){
            sb.append(interpolated.codeGen());
            sb.append("\n");
        }
        return sb.toString();
    }
}
