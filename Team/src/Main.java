import java.util.Scanner;

public class Main {
    /** lookup_book() method.
     * This method is called by the main method.
     * It asks the user how they want to search for the book
     * and returns it
     */
    public static void lookup_book() {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Look up a book by:");
            System.out.println("[1] Author");
            System.out.println("[2] Title");
            System.out.println("[3] Publication Year");
            System.out.println("[4] Return to Menu");

            int lookup = input.nextInt();

            switch (lookup) {
                case 1:
                    //looks up book by author's name
                    break;
                case 2:
                    //looks up book by title
                    break;
                case 3:
                    //looks up book by publication year
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

    /**
     *
     */
    public static void enter_book() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = input.nextLine();

        System.out.println("Enter author:");
        String author = input.nextLine();

        System.out.println("Enter publication year:");
        int year = input.nextInt();

        System.out.println("Is this a hardback [1], e-book [2], or audiobook [3]?:");
        int option = input.nextInt();

        int page = 0;
        double file = 0;

        switch (option) {
            case 1:
                //hardback
                System.out.println("Page count:");
                page = input.nextInt();
                System.out.println("Book has been processed.");
                break;
            case 2:
                //ebook
                System.out.println("Page count:");
                page = input.nextInt();
                System.out.println("File size:");
                file = input.nextDouble();
                System.out.println("Book has been processed.");
                break;
            case 3:
                // audiobook
                System.out.println("Recording Length (hh:mm:ss):");
                String length = input.nextLine();

                System.out.println("File size:");
                file = input.nextDouble();
                System.out.println("Book has been processed.");
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
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Would you like to enter a book [1], look up a book [2], or quit [3]?");
            int in = input.nextInt();
            switch (in) {
                case 1:
                    enter_book();
                    break;
                case 2:
                    lookup_book();
                    break;
                case 3:
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
