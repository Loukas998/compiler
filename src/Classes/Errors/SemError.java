package Classes.Errors;

public class SemError {
    public String errorMessage;
    public int line;
    public int characterPlacement;
    public SemError(){

    }
    public SemError(String errorMessage, int line, int characterPlacement){
        this.errorMessage = errorMessage;
        this.line = line;
        this.characterPlacement = characterPlacement;
    }
    public String print(){
        return  this.errorMessage + "\n"+
                "At Line " + this.line +"\n"
                + "At character " + this.characterPlacement + "\n";

    }
}
