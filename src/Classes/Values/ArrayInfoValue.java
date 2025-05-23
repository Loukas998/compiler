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
    public String printVals(){
        String ans = " " ;
        for (int i = 0 ; i < arrayValues.size();i++){
            ans += arrayValues.get(i).toString();
        }
        return ans;
    }
    @Override
    public String toString(){
        return "\n ArrayInfoValue {" +
                "\n arrayValues: " + printVals() +
                "\n }";
    }
}
