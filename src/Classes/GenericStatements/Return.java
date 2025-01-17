package Classes.GenericStatements;

import Classes.Values.ValueType;

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
}
