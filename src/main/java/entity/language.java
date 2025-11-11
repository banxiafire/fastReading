package java.entity;

public class language {
    private String language;

    public language(String lang){
        this.language = lang;
    }

    public String getLanguage(){return this.language;}

    public void modifyLanguage(String language){
        this.language = language;
    }
}
