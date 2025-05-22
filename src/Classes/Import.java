package Classes;

public class Import extends Expression{
    public String type;
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
        if(this.type.equals("NgIf")) return "NgIfImport: " + this.type  + "From" + this.fromPath;
        else if(this.type.equals("NgFor")) return "NgForImport: " + this.type + "From" + this.fromPath;
        else if(this.type.equals("Component")) return "ComponentImport: " + this.type + "From" + this.fromPath;
        return "IDImport: " + this.type + "From" + this.fromPath;
    }
}
