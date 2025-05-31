package Classes.Errors;

public class DuplicateValueError extends  SemError {
    public DuplicateValueError(String valueName, int line, int charPos){
        this.errorMessage = "Value " + valueName + " already exists " ;
        this.line = line;
        this.characterPlacement = charPos;
    }
}
