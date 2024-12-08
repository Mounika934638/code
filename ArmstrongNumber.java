import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if the number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();  // Number of digits
        int sum = 0;

        // Calculate the sum of digits raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            sum += Math.pow(digit, numDigits);  // Add the power of the digit to sum
            num /= 10;  // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }
}
