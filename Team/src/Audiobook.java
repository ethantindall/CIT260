/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Audiobook Class
 */

public class Audiobook extends DigitalBook {
    //member variables
    private double length;
    private String fileType;


    /**
     * Audiobook constructor
     */
    Audiobook() {
        length = 0;}

    public Audiobook(String title, String author, int publicationYear, int difficulty, double fileSize, double length) {
        super(title, author, publicationYear, difficulty, fileSize);
        setLength(length);
    }

    public Audiobook(String title, String author, int year, int difficulty, double file, String length) {
    }

    /**
     * getLength method
     * @param: none
     * @return length
     */
    public double getLength() {return length;}

    /**
     * setLength method
     * @param x
     * @return none
     */
    public void setLength(double x) {length = x;}

    /**
     * setFileType method
     * @param x
     * @return none
     */
    public void setFileType(String x) {fileType = x;}

    public String toString(){
        String daString = super.toString();
        daString += " , " + this.fileType + "\n";
        daString += " , " + this.length + "\n";

        return daString;
    }

}

