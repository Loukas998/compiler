package Classes.Errors;


public class FileError extends  SemError{
    public FileError(int line, int characterPlacement) {
        this.errorMessage="File Doesn't exist";
        this.line=line;
        this.characterPlacement=characterPlacement;
    }
}
