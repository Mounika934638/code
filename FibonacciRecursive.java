import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to find its Fibonacci number: ");
        int n = scanner.nextInt();

        // Validate the input
        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            // Call the recursive function to calculate the Nth Fibonacci number
            long result = fibonacci(n);

            // Output the result
            System.out.println("The Fibonacci number at position " + n + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate Fibonacci number
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;  // Base case: F(0) = 0
        } else if (n == 1) {
            return 1;  // Base case: F(1) = 1
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
