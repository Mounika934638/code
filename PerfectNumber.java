import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if the number is a perfect number
    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false; // 1 and any negative number cannot be perfect
        }

        int sum = 0;

        // Find the proper divisors of the number and sum them up
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {  // i is a divisor of num
                sum += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == num;
    }
}
