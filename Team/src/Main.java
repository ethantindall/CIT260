/** Team Assignment
 *  CIT 260
 *  Ethan Tindall & Nathan Martherus
 *  Main Class
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /** lookup_book() method.
     * This method is called by the main method.
     * It asks the user how they want to search for the book
     * and returns it
     */
    public static void lookup_book() {
        //set up scanner and file reader
        Scanner input = new Scanner(System.in);
        String lookupFile = "library.txt";
        BufferedReader br;
        String line;
        String split = ", ";
        boolean loop = true;
        //while this loop is running, ask the user how they want to search for the book
        while (loop) {
            System.out.println("");
            System.out.println("Look up a book by:");
            System.out.println("[1] Author");
            System.out.println("[2] Title");
            System.out.println("[3] Publication Year");
            System.out.println("[4] Return to Menu");

            //accept their input and search for book by chosen method
            int lookup = input.nextInt();
            String way;
            switch (lookup) {
                case 1:
                    //looks up book by author's name
                    System.out.print("Enter the author's name: ");
                    input.nextLine();
                    way = input.nextLine();
                    try {
                        //search file by row for the lookup parameters
                        br = new BufferedReader(new FileReader(lookupFile));
                        boolean found = false;
                        while ((line = br.readLine()) != null) {
                            String[] book = line.split(split);
                            //if you find the search parameter, print the book info
                            if (book[2].contains(way)) {
                                System.out.println("");
                                System.out.println(book[1] + " by " + book[2] + ". Published: " + book[3] +".");
                                found = true;
                            }
                        }
                        if (found == false) {
                            System.out.println("");
                            System.out.println("No books found. Try again.");
                            System.out.println("");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    //looks up book by title
                    System.out.print("Enter the book's title: ");
                    input.nextLine();
                    way = input.nextLine();
                    try {
                        //search file by row for the lookup parameters
                        br = new BufferedReader(new FileReader(lookupFile));
                        boolean found = false;
                        while ((line = br.readLine()) != null) {
                            String[] book = line.split(split);
                            //if you find the search parameter, print the book info
                            if (book[1].contains(way)) {
                                System.out.println("");
                                System.out.println(book[1] + " by " + book[2] + ". Published: " + book[3] + ".");
                                found = true;
                            }
                        }
                        if (found == false) {
                                System.out.println("");
                                System.out.println("No books found. Try again.");
                                System.out.println("");
                            }

                    }
                    catch (IOException e) {e.printStackTrace();}
                    break;
                case 3:
                    //looks up book by publication year
                    System.out.print("Enter the book's publication year: ");
                    input.nextLine();
                    way = input.nextLine();
                    try {
                        //search file by row for the lookup parameters
                        br = new BufferedReader(new FileReader(lookupFile));
                        boolean found = false;
                        while ((line = br.readLine()) != null) {
                            String[] book = line.split(split);
                            //if you find the search parameter, print the book info
                            if (book[3].contains(way)) {
                                System.out.println("");
                                System.out.println(book[1] + " by " + book[2] + ". Published: " + book[3] +".");
                                found = true;
                            }
                        }
                        if (found == false) {
                            System.out.println("");
                            System.out.println("No books found. Try again.");
                            System.out.println("");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
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
    public static Book enter_book() {
        //set up scanner and get input
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = input.nextLine();
        Book daBook;

        System.out.println("Enter author:");
        String author = input.nextLine();

        System.out.println("Enter publication year:");
        int year = input.nextInt();

        System.out.println("Is this a hardback [1], e-book [2], or Audiobook [3]?:");
        int option = input.nextInt();

        int pageCount;
        String fileType ="";
        double length;


        switch (option) {
            case 1:
                //hardback
                System.out.println("Page count:");
                pageCount = input.nextInt();

                System.out.println("Book has been processed.");
                // Save book to file
                daBook = new Hardcopy(title, author, year, pageCount);

                break;

            case 2:
                //ebook
                System.out.println("Page count:");
                pageCount = input.nextInt();
                System.out.println("File type:");
                input.nextLine();
                fileType = input.nextLine();
                System.out.println("Book has been processed.");
                // Save book to file
                daBook = new Ebook(title, author, year, fileType, pageCount);
                break;
            case 3:
                // audiobook
                System.out.println("Recording Length (minutes):");
                length = input.nextDouble();
                input.nextLine();
                System.out.println("File type:");
                fileType = input.nextLine();
                System.out.println("Book has been processed.");
                // Save book to file
                daBook = new Audiobook(title, author, year, fileType, length);
                break;
            default:
                //try again
                System.out.println("Try again.");
                daBook = null;
                break;
            }
        return daBook;
    }

    public static void WriteLibrary( ArrayList<Book> library, String fileName ) {
        // open/create the library file
        PrintWriter Library = null;
        try {
            Library = new PrintWriter(new FileWriter(fileName, true));

            // write array to the file
            for (int i=0; i<library.size(); i++) {

                Library.printf("%s", library.get(i).toString());
            }

            Library.close();
        }
        catch (FileNotFoundException fnf) {
            System.out.print("Sorry, the Library is closed");
        } catch (IOException e) {
            System.out.print("sorry, the Library is closed");
        }
    }

    public static ArrayList<Book> ReadLibrary(String fileName)
    {
        ArrayList<Book> libraryArray = new ArrayList<>();
        // todo

        return libraryArray;
    }


    /**
     * main method
     */
    public static void main(String[] args) {

        //create the library array
        final String libraryFile= "library.txt";
        ArrayList<Book> libraryArray = ReadLibrary(libraryFile);

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
                    libraryArray.add(enter_book());
                    WriteLibrary(libraryArray, libraryFile);
                    break;
                case 2:
                    //lookup a book
                    lookup_book();
                    break;
                case 3:
                    //quit
                    System.out.println("Goodbye.");
                    WriteLibrary(libraryArray, libraryFile);
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
