import java.util.Scanner;

public class SquarePatternStars {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the size of the square: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Print square pattern using stars (*)
            printSquarePatternStars(n);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to print square pattern using stars
    public static void printSquarePatternStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");  // Print a star followed by a space
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}
