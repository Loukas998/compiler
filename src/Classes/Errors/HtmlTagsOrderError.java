package Classes.Errors;

public class HtmlTagsOrderError extends SemError{

    public HtmlTagsOrderError(String lastTagOpened,String tagClosedAttempt,int line, int characterPlacement) {
        this.errorMessage="HtmlTags not Closed in Order,current tag to be closed is "
                +lastTagOpened+", tag attempted to close"
                +tagClosedAttempt;
        this.line=line;
        this.characterPlacement=characterPlacement;
    }
}
