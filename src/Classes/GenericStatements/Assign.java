package Classes.GenericStatements;

import Classes.Values.ValueType;

public class Assign extends GenericStatement{
    public String firstId;
    public String secondId;
    public ValueType valueType;
    public Assign(){}

    public Assign(String firstId, String secondId, ValueType valueType) {
        this.firstId=firstId;
        this.secondId = secondId;
        this.valueType = valueType;
    }

    @Override
    public String toString(){
        if(firstId != null){
            return "\n Assign {" +
                    "\n , thisOrId: " + //this.firstId +
                    "\n , variableName: " + //this.secondId +
                    "\n , newValue: " + //this.valueType.toString() +
                    "\n}";
        }

        return "\n Assign {" +
                "\n variableName =  " + //this.secondId +
                "\n , newValue  " + //this.valueType.toString() +
                "\n}";
    }
}
