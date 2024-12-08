import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find and print the LCM
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner
        scanner.close();
    }

    // Function to find the GCD of two numbers using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find the LCM of two numbers
    public static int findLCM(int a, int b) {
        // Use the formula LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / findGCD(a, b);
    }
}
