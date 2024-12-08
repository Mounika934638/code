import java.util.Scanner;

public class FibonacciSeriesRecursive {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            // Print the Fibonacci series up to 'n' terms
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive function to return the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: Fibonacci(0) = 0 and Fibonacci(1) = 1
        } else {
            // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
