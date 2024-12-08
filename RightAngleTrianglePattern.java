import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the right-angle triangle pattern
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print the stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
