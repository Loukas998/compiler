package Classes.GenericStatements;

import Classes.Values.ValueType;

import java.io.FileWriter;

public class Return extends GenericStatement{
    public String id;
    public ValueType valueType;
    public Return(){}

    public Return(String id, ValueType valueType) {
        this.id = id;
        this.valueType = valueType;
    }

    @Override
    public String toString(){
        if(this.id == null){
            return "\n Return {" +
                    "\n valueReturned: " + this.valueType +
                    "\n}";
        }

        return "\n Return {" +
                "\n thisOrId: " + this.id +
                "\n , valueReturned: " + this.valueType +
                "\n}";
    }

    @Override
    public void codeGen(String s, FileWriter fw) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("return");
        if(this.id!=null){
            sb.append(this.id);
        }
        this.valueType.codeGen(s,fw);
    }
}
