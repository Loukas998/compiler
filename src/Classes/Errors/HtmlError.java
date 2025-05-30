package Classes.Errors;

public class HtmlError extends SemError{
    public HtmlError(int line, int characterPlacement) {
        this.errorMessage="Attribute with the same name already exists ";
        this.line=line;
        this.characterPlacement=characterPlacement;
    }
}
