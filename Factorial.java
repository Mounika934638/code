import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Call the factorial function
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the factorial using an iterative approach
    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
