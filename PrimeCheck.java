import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // If num is less than or equal to 1, it's not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If divisible by any number, it's not prime
            }
        }

        return true;  // If no divisors found, the number is prime
    }
}
