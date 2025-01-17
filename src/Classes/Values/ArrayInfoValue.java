package Classes.Values;

import java.util.ArrayList;
import java.util.List;

public class ArrayInfoValue extends ValueType{
    public List<ValueType> arrayValues;
    public ArrayInfoValue(){
        this.arrayValues = new ArrayList<>();
    }
    public ArrayInfoValue(List<ValueType> arrayValues) {
        this.arrayValues = arrayValues;
    }
    public void addArrayValue(ValueType v){
        arrayValues.add(v);
    }

    @Override
    public String toString(){
        return arrayValues.toString();
    }
}
