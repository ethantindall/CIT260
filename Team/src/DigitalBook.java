public class DigitalBook extends Book {
    private double fileSize;

    DigitalBook() {
        fileSize = 0;
    }

    public DigitalBook(String title, String author, int publicationYear, int difficulty, double fileSize) {
        super(title, author, publicationYear, difficulty);
        setSize(fileSize);
    }


    public double getSize() {return fileSize;}
    public void setSize(double x) {fileSize = x;}
}
