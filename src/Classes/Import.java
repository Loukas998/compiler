package Classes;

public class Import extends Expression{
    public String type;
    public String altName;
    public String fromPath;
    public Import(){

    }
    public  Import(String type){
        this.type=type;
    }
    public  Import(String type,String fromPath){
        this.type = type;
        this.fromPath = fromPath;
    }
    @Override
    public String toString(){
        if(this.type.equals("NgIf")) return "Import Statement";
        else if(this.type.equals("NgFor")) return "Import Statement";
        else if(this.type.equals("Component")) return "Import Component ";
        return "Import Statement ";
    }
}
