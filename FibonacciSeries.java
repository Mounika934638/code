import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms to generate in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci series
        generateFibonacci(n);

        // Close the scanner
        scanner.close();
    }

    // Function to generate and print Fibonacci series up to n terms
    public static void generateFibonacci(int n) {
        // Handle the case where the number of terms is 0 or negative
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        // First two terms of Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        // If there's only one term, print '0'
        if (n == 1) {
            System.out.print(a);
        } else {
            // Print the first two terms
            System.out.print(a + " " + b);

            // Loop to generate and print the rest of the series
            for (int i = 3; i <= n; i++) {
                int nextTerm = a + b;
                System.out.print(" " + nextTerm);

                // Update the values of a and b
                a =
