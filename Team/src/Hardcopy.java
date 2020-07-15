public class Hardcopy extends Book {
    private int pageCount;

    /**
     * Constructors
     */
    Hardcopy() {
        pageCount = 0;
    }
    public Hardcopy(String title, String author, int publicationYear, int pageCount) {
        super(title, author, publicationYear);
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
    /*--------------GETTERS AND SETTERS---------*/


    /**
     * getPageCount
     * @param: none
     * @return: pages
     */
    public int getPageCount() {return pageCount;}

    /**
     * setPageCount
     * @param x
     * @return: none
     */
    public void setPageCount(int x) {pageCount = x;}

    /**
     * toString
     * turns data to string to write to file
     * @return
     */

}

