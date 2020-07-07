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
     * main method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Would you like to enter a book [1], look up a book [2], or quit [3]?");
            int in = input.nextInt();

            switch (in) {
                case 1:
                    lookup_book();
                    break;
                case 2:
                    System.out.println("Please enter a book");
                    break;
                case 3:
                    break label;
                default:
                    //raise exception
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
        System.out.println("Goodbye.");
    }
}
