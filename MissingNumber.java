import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array (n - 1, since one number is missing)
        System.out.print("Enter the size of the array (excluding the missing number): ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the missing number
        int missingNumber = findMissingNumber(array, size + 1); // Total numbers would be size + 1

        // Output the missing number
        System.out.println("The missing number in the sequence is: " + missingNumber);

        // Close the scanner
        scanner.close();
    }

    // Function to find the missing number in the sequence
    public static int findMissingNumber(int[] array, int totalSize) {
        // Calculate the expected sum of the first 'totalSize' numbers
        int expectedSum = totalSize * (totalSize + 1) / 2;

        // Calculate the actual sum of the numbers in the array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }
}
