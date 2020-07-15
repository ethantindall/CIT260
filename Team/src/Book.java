/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Book Class
 */

public class Book {
    //member variables
    private String title;
    private String author;
    private int publicationYear;


    /**
     * Book constructor
     */
    Book() {
        author = "";
        title = "";
        publicationYear = 0;

    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    /**
     * toString method
     * turns data to string to write to file
     *
     * @return daString
     */
    public String toString() {
        String daString = super.toString();
        daString += ", " + this.title;
        daString += ", " + this.author;
        daString += ", " + this.publicationYear;
        return daString;
    }

    /*---------GETTERS AND SETTERS -------------------*/

    /**
     * getAuthor
     * @param
     * @return author
     */
    public String getAuthor() {return author;}

    /**
     * setAuthor method
     * @param x
     * @return none
     */
    public void setAuthor(String x) {author = x;}

    /**
     * getTitle method
     * @return title
     * @param: none
     */
    public String getTitle() {return title;}

    /**
     * setTitle method
     * @param x
     * @return none
     */
    public void setTitle(String x) {title = x;}

    /**
     * getYear method
     * @return year
     * @param: none
     */
    public int getYear() {return publicationYear;}

    /**
     * setYear method
     * @param x
     * @return none
     */
    public void setYear(int x) {publicationYear = x;}
}

