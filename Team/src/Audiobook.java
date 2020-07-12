public class Audiobook extends DigitalBook {
    private double length;

    Audiobook() {
        length = 0;}

    public Audiobook(String title, String author, int publicationYear, int difficulty, double length) {
        super();
        setLength(length);
    }

    public double getLength() {return length;}
    public void setLength(double x) {length = x;}

}
