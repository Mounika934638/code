import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum using the formula
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the sum of the first 'n' natural numbers
    public static int sumOfNaturalNumbers(int n) {
        // Using the formula: Sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }
}
