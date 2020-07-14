/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Main Class
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /** lookup_book() method.
     * This method is called by the main method.
     * It asks the user how they want to search for the book
     * and returns it
     */
    public static void lookup_book() {
        //set up scanner
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        //while this loop is running, ask the user how they want to search for the book
        while (loop) {
            System.out.println("Look up a book by:");
            System.out.println("[1] Author");
            System.out.println("[2] Title");
            System.out.println("[3] Publication Year");
            System.out.println("[4] Return to Menu");

            //accept their input and search for book by chosen method
            int lookup = input.nextInt();
            switch (lookup) {
                case 1:
                    //looks up book by author's name
                    // TO DO
                    break;
                case 2:
                    //looks up book by title
                    // TO DO
                    break;
                case 3:
                    //looks up book by publication year
                    // TO DO
                    break;
                case 4:
                    //returns to main menu
                    loop = false;
                    break;
                default:
                    System.out.println("Please enter a number.");
            }
        }
    }

    /** enter_book method
     * Input none
     * output none
     * This method gathers the information for the book
     */
    public static void enter_book() {
        //set up scanner and get input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = input.nextLine();

        System.out.println("Enter author:");
        String author = input.nextLine();

        System.out.println("Enter publication year:");
        int year = input.nextInt();

        System.out.println("Is this a hardback [1], e-book [2], or Audiobook [3]?:");
        int option = input.nextInt();

        int page = 0;
        double file = 0;

        switch (option) {
            case 1:
                //hardback
                System.out.println("Page count:");
                page = input.nextInt();
                System.out.println("Book has been processed.");
                //create the library array
                ArrayList<String> library = new ArrayList<>();
                // Save book to file
                library.add(new Hardcopy(String title, String author, int publicationYear, int difficulty, int pageCount));
                break;

            case 2:
                //ebook
                System.out.println("Page count:");
                page = input.nextInt();
                System.out.println("File size:");
                file = input.nextDouble();
                System.out.println("Book has been processed.");
                // Save book to file
                library.add(new Ebook(String title, String author, int publicationYear, int difficulty, double fileSize));
                break;
            case 3:
                // audiobook
                System.out.println("Recording Length (hh:mm:ss):");
                String length = input.nextLine();
                System.out.println("File size:");
                file = input.nextDouble();
                System.out.println("Book has been processed.");
                // Save book to file
                library.add(new Audiobook(String title, String author, int publicationYear, int difficulty, double fileSize, double length));
                break;
            default:
                //try again
                System.out.println("Try again.");
                break;
        }
    }



    /**
     * main method
     */
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);
        boolean run = true;

        // while this loop is true, ask the user what they want to do
        while (run) {
            System.out.println("Would you like to enter a book [1], look up a book [2], or quit [3]?");
            int in = input.nextInt();
            switch (in) {
                case 1:
                    //enter a book
                    enter_book();
                    break;
                case 2:
                    //lookup a book
                    lookup_book();
                    break;
                case 3:
                    //quit
                    System.out.println("Goodbye.");
                    run = false;
                    break;
                default:
                    //raise exception
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
    }
}
