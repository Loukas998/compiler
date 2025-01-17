package Classes;

public class VarType {
    public String type;
    public VarType(){

    }
    public VarType(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        if(this.type!=null){
            return this.type;
        }
        return " ";
    }
}
