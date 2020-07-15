/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Audiobook Class
 */

public class Audiobook extends DigitalBook {
    //member variables
    private double length;


    /**
     * Audiobook constructor
     */
    Audiobook() {
        length = 0;}

    public Audiobook(String title, String author, int publicationYear, String fileType, double length) {
        super(title, author, publicationYear, fileType);
        setLength(length);
    }




    /**
     * toString
     * converts data to string to be written to file
     * @return
     */
    public String toString(){
        String daString = super.toString();
        daString += ", " + this.length + "\n";
        return daString;
    }
    /*------------------GETTERS AND SETTERS -----------------*/

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



}

