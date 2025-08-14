package Classes.Values;

import java.io.FileWriter;

public class ArrayIndexedValue extends  ValueType{
    public ValueType value;
    public ValueType indexAt;
    public ArrayIndexedValue(){

    }
    public ArrayIndexedValue(ValueType value,ValueType indexAt){
        this.value = value;
        this.indexAt = indexAt;
    }

    @Override
    public String toString() {
        return "\n ArrayIndexedValue {"+
                "\n Value:" +  value.toString() +
                "\n Indexed At" + indexAt.toString() +
                "\n" +
                "}";
    }


    public String codeGen() {
        return value.codeGen() +
                "[" +
                indexAt.codeGen() +
                "]";
    }
}
