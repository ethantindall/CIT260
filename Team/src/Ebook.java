/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Ebook Class
 */

public class Ebook extends DigitalBook {
    //member variables
    private int pageCount;

    /**
     * Ebook constructor
     */
    Ebook() {
        pageCount = 0;
    }
    public Ebook(String title, String author, int publicationYear, String fileType, int pageCount) {
        super(title, author, publicationYear, fileType);
        setPageCount(pageCount);
    }

    /**
     * toString
     * converts data to string to be written to file
     * @return
     */
    public String toString(){
        String daString = super.toString();
        daString += ", " + this.pageCount + "\n";
        return daString;
    }


    /*------GETTERS AND SETTERS--------*/

    /**
     * setPageCount method
     * @param x
     * @return none
     */
    public void setPageCount(int x) {pageCount = x;}

    /**
     * getPageCount method
     * @param: none
     * @return pagecount
     */
    public int getPageCount() {return pageCount;}
}
