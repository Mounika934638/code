import java.util.Scanner;

public class SumOfEvenNumbers {

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
            // Calculate the sum of even numbers
            int sum = sumOfEvenNumbers(n);
            System.out.println("The sum of even numbers up to " + n + " is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the sum of even numbers up to 'n'
    public static int sumOfEvenNumbers(int n) {
        int sum = 0;

        // Loop through the numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {  // Start from 2 and increment by 2 (only even numbers)
            sum += i;  // Add the even number to sum
        }
        
        return sum;
    }
}
