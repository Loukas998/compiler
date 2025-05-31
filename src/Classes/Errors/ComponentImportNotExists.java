package Classes.Errors;

public class ComponentImportNotExists extends  SemError{
    public ComponentImportNotExists(int line , int charPos){
        this.line = line;
        this.characterPlacement = charPos;
        this.errorMessage = "Main Component Import Doesn't Exist";
    }

}
