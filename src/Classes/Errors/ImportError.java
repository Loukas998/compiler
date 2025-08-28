package Classes.Errors;

public class ImportError extends SemError{
    public ImportError( String message,int line, int characterPlacement) {
        this.errorMessage=message+" Used but Not Imported ";
        this.line=line;
        this.characterPlacement=characterPlacement;

    }
}
