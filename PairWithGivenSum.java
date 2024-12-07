import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        // Call the function to find the pair with the given sum
        findPairWithGivenSum(array, targetSum);

        // Close the scanner
        scanner.close();
    }

    // Function to find the 
