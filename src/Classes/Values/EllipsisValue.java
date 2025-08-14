package Classes.Values;

import java.io.FileWriter;

public class EllipsisValue extends  ValueType{
    public  ValueType value;
    public EllipsisValue(){
    }

    public EllipsisValue(ValueType value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return "\n EllipsisValue {"+
                "\n Value:" +  value.toString() +
                "\n}";
    }

    @Override
    public String codeGen() {
        return "..." +
                value.codeGen();
    }
}
