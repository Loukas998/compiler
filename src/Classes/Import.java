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
        return this.type;
    }
}
