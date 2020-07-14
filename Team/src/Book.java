/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Book Class
 */

public class Book {
    //member variables
    private String author;
    private String title;
    private int publicationYear;
    private int difficulty;
    private String fileType;


    /**
     * Book constructor
     */
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

    public String getAuthor() {return author;}

    /**
     * setAuthor method
     * @param x
     * @return none
     */
    public void setAuthor(String x) {author = x;}

    public String getTitle() {return title;}

    /**
     * setTitle method
     * @param x
     * @return none
     */
    public void setTitle(String x) {title = x;}

    /**
     * getYear method
     * @param x
     * @return none
     */
    public int getYear() {return publicationYear;}

    /**
     * setYear method
     * @param x
     * @return none
     */
    public void setYear(int x) {publicationYear = x;}

    /**
     * getDifficulty method
     * @param x
     * @return none
     */
    public int getDifficulty() {return difficulty;}

    /**
     * setDifficulty method
     * @param x
     * @return none
     */
    public void setDifficulty(int x) {difficulty = x;}

    /**
     * setFileType
     */
    public void setFileType() {};

    /**
     * getFileType method
     * @param x
     * @return none
     */
    public String getFileType() {return fileType;}
}
