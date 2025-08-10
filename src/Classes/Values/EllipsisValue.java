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
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("...");
        value.codeGen(s,fw);
    }
}
