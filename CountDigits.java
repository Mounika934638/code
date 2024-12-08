import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of digits
        int digitCount = countDigits(number);

        // Output the result
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the digits in a number
    public static int countDigits(int number) {
        // If the number is 0, it has 1 digit
        if (number == 0) {
            return 1;
        }

        // If the number is negative, work with the absolute value
        number = Math.abs(number);

        // Initialize a counter for the digits
        int count = 0;

        // Loop to count the digits
        while (number > 0) {
            number /= 10;  // Remove the last digit
            count++;  // Increment the counter
        }

        return count;  // Return the total digit count
    }
}
