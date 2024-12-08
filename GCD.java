import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find and print the GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Close the scanner
        scanner.close();
    }

    // Function to find the GCD of two numbers using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        // Loop until b becomes zero
        while (b != 0) {
            int temp = b;
            b = a % b;  // Update b to the remainder of a divided by b
            a = temp;   // Update a to the previous value of b
        }
        return a;  // When b becomes zero, a will be the GCD
    }
}
