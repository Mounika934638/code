import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the base and exponent
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the power using the power function
        double result = calculatePower(base, exponent);

        // Output the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the power of a number
    public static double calculatePower(double base, int exponent) {
        double result = 1;

        // If exponent is negative, work with positive exponent and take reciprocal
        if (exponent < 0) {
            base = 1 / base;  // Invert the base for negative exponent
            exponent = -exponent;  // Make the exponent positive
        }

        // Loop to calculate base raised to the power of exponent
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}
