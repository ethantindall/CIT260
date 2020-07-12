public class Ebook extends DigitalBook {
    private String fileType;
    private String audio;

    Ebook() {
        fileType = "";
        audio = "";
    }

    public Ebook(String title, String author, int publicationYear, int difficulty, double fileSize) {
        super(title, author, publicationYear, difficulty, fileSize);
        setFileType(fileType);
    }
    public String getFileType() {return fileType;}
    public void setFileType(String x) {fileType = x;}

    public String getAudio() {return audio;}
    public void setAudio(String x) {audio = x;}
}
