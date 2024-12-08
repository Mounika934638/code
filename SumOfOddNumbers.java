import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of odd numbers
            int sum = sumOfOddNumbers(n);
            System.out.println("The sum of odd numbers up to " + n + " is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the sum of odd numbers up to 'n'
    public static int sumOfOddNumbers(int n) {
        int sum = 0;

        // Loop through the numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                sum += i;  // Add the odd number to sum
            }
        }
        
        return sum;
    }
}
