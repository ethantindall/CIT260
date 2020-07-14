/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Ebook Class
 */

public class Ebook extends DigitalBook {
    //member variables
    private String fileType;
    private String audio;

    /**
     * Ebook constructor
     */
    Ebook() {
        fileType = "";
        audio = "";
    }

    public Ebook(String title, String author, int publicationYear, int difficulty, double fileSize) {
        super(title, author, publicationYear, difficulty, fileSize);
        setFileType(fileType);
    }



    /**
     * setFileType method
     * @param x
     * @return none
     */
    public void setFileType(String x) {fileType = x;}

    /**
     * getAudio method
     * @param: none
     * @return audio
     */
    public String getAudio() {return audio;}

    /**
     * setAudio method
     * @param x
     * @return none
     */
    public void setAudio(String x) {audio = x;}

    public String toString(){
        String daString = super.toString();
        daString += " , " + this.audio + "\n";

        return daString;
    }
}
