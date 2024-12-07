import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the sorted array
        int[] array = new int[size];

        // Input the elements of the sorted array
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to perform binary search
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find the middle element

            // Check if target is at mid
            if (array[mid] == target) {
                return mid; // Return the index if target is found
            }

            // If target is smaller, ignore the right half
            if (array[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Return -1 if element is not found
        return -1;
    }
}
