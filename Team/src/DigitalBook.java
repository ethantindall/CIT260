/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  DigitalBook Class
 */

public class DigitalBook extends Book {
    //member variables
    private String fileType;


    /**
     * DigitalBook constructor
     */
    DigitalBook() {fileType = "";}

    public DigitalBook(String title, String author, int publicationYear, String fileType) {
        super(title, author, publicationYear);
        setFileType(fileType);
    }


    /**
     * toString
     * converts data to string to be written to file
     * @return
     */
    public String toString(){
        String daString = super.toString();
        daString += ", " + this.fileType;

        return daString;
    }

    /*---------------GETTER AND SETTER ------------*/

    /**
     * setFileType method
     * @param x
     * @return none
     */
    public void setFileType(String x) {fileType = x;}

    /**
     * getFileType
     * @param
     * @return: fileType
     */
    public String getFileType() {return fileType;}




}



