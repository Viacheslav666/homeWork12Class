public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }

    public String getSurNameAuthor() {
        return this.surNameAuthor;
    }

    public void  setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    public void setSurNameAuthor(String surNameAuthor){
        this.surNameAuthor = surNameAuthor;
    }
}