package Classes.Errors;

public class DuplicateAttributeError extends SemError{
    public DuplicateAttributeError(String errorMessage, int line, int characterPlacement) {
        this.errorMessage="Variable "+errorMessage+" Already Exists in this Scope";
        this.line=line;
        this.characterPlacement=characterPlacement;
    }
}
