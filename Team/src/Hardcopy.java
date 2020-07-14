public class Hardcopy extends Book {
    private int pageCount;

    Hardcopy() {
        pageCount = 0;
    }

    public Hardcopy(String title, String author, int publicationYear, int difficulty, int pageCount) {
        super(title, author, publicationYear, difficulty);
        setPageCount(pageCount);
    }

    public int getPageCount() {return pageCount;}
    public void setPageCount(int x) {pageCount = x;}

    public String toString(){
        String daString = super.toString();
        daString += " , " + this.pageCount + "\n";

        return daString;
    }
}

