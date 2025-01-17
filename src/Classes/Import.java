package Classes;

public class Import extends Expression{
    public String type;
    public Import(){

    }
    public  Import(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        if(this.type.equals("NgIf")) return "NgIfImport: " + this.type;
        else if(this.type.equals("NgFor")) return "NgForImport: " + this.type;
        else if(this.type.equals("Component")) return "ComponentImport: " + this.type;
        return "IDImport: " + this.type;
    }
}
