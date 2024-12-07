import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number to reverse
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the reverse function
        int reversed = reverseNumber(number);

        // Output the reversed number
        System.out.println("Reversed number: " + reversed);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        // While the number is greater than 0
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Append the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        return reversed;
    }
}
