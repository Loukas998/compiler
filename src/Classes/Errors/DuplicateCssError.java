package Classes.Errors;

public class DuplicateCssError extends SemError{
    public DuplicateCssError(int line, int characterPlacement) {
        this.errorMessage="Duplicate CSS file name";
        this.line=line;
        this.characterPlacement=characterPlacement;
    }
}
