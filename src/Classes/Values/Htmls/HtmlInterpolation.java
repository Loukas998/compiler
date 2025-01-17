package Classes.Values.Htmls;

import Classes.Values.ValueType;

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
        return valueTypes.toString();
    }
}
