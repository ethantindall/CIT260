/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  DigitalBook Class
 */

public class DigitalBook extends Book {
    //member variables
    private double fileSize;
    private String fileType;


    /**
     * DigitalBook constructor
     */
    DigitalBook() {
        fileSize = 0;
    }

    public DigitalBook(String title, String author, int publicationYear, int difficulty, double fileSize) {
        super(title, author, publicationYear, difficulty);
        setSize(fileSize);
    }

    /**
     * getSize method
     * @param: none
     * @return none
     */
    public double getSize() {return fileSize;}

    /**
     * setSize method
     * @param x
     * @return none
     */
    public void setSize(double x) {fileSize = x;}

    /**
     * setFileType method
     * @param x
     * @return none
     */
    public void setFileType(String x) {fileType = x;}
}
