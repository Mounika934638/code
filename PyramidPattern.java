import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows (height of the pyramid)
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces for the left side of the pyramid
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
