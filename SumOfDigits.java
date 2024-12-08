import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the sum of digits
        int sum = sumOfDigits(number);

        // Output the result
        System.out.println("The sum of digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Function to find the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Loop to calculate the sum of digits
        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10; 
