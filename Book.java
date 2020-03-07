public class Book {
    private String Name, Author, ISBN, Date, Language;

    public Book(){
        System.out.println("new Book has been Created");
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public void setAuthor(String newAuthor){
        this.Author = newAuthor;
    }
    public void setISBN(String newISBN){
        this.ISBN = newISBN;
    }
    public void setDate(String newDate){
        this.Date = newDate;
    }
    public void setLanguage(String newLanguage){
        this.Language = newLanguage;
    }
    public String getName(){
        return this.Name;
    }
    public String getAuthor(){
        return this.Author;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public String getDate(){
        return this.Date;
    }
    public String getLanguage(){
        return this.Language;
    }
}
