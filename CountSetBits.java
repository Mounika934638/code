import java.util.Scanner;

public classimport java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of set bits
        int setBitCount = countSetBits(number);

        // Output the result
        System.out.println("The number of set bits in " + number + " is: " + setBitCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the set bits (1s) in the binary representation of a number
    public static int countSetBits(int number) {
        int count = 0;

        // Loop until the number becomes 0
        while (number > 0) {
            // Increment the count if the least significant bit is 1
            count += number & 1;

            // Right shift the number by 1 to check the next bit
            number >>= 1;
        }

        return count;  // Return the total count of set bits
    }
}
