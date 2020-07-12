public class Book {
    private String author;
    private String title;
    private int publicationYear;
    private int difficulty;

    Book() {
        author = "";
        title = "";
        publicationYear = 0;
        difficulty = 0;
    }
    public Book(String title, String author, int publicationYear, int difficulty) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.difficulty = difficulty;

    }

    public String getAuthor() {return author};
    public void setAuthor(String x) {author = x;}

    public String getTitle() {return title};
    public void setTitle(String x) {title = x;}

    public int getYear() {return publicationYear};
    public void setYear(int x) {publicationYear = x;}

    public int getDifficulty() {return difficulty};
    public void setDifficulty(int x) {difficulty = x;}


}
