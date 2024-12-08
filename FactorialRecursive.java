import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Call the recursive function to calculate the factorial
            long result = factorial(number);

            // Output the result
            System.out.println("The factorial of " + number + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }
}
