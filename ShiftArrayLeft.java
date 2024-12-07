import java.util.Scanner;

public class ShiftArrayLeft {
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

        // Input the number of positions to shift
        System.out.print("Enter the number of positions to shift: ");
        int k = scanner.nextInt();

        // Normalize the shift positions
        k = k % size;  // If k is greater than size, adjust it

        // Shift the array to the left by k positions
        shiftArrayLeft(array, k);

        // Output the shifted array
        System.out.println("Array after shifting to the left by " + k + " positions:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to shift the array to the left by k positions
    public static void shiftArrayLeft(int[] array, int k) {
        int size = array.length;

        // Step 1: Reverse the first part (0 to k-1)
        reverseArray(array, 0, k - 1);

        // Step 2: Reverse the second part (k to size-1)
        reverseArray(array, k, size - 1);

        // Step 3: Reverse the entire array (0 to size-1)
        reverseArray(array, 0, size - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
