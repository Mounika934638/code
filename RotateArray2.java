import java.util.Scanner;

public class RotateArray2 {
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

        // Input the number of positions to rotate
        System.out.print("Enter the number of positions to rotate: ");
        int positions = scanner.nextInt();

        // Normalize the positions if they are greater than the size of the array
        positions = positions % size;  // In case of rotations larger than the array size

        // Rotate the array to the right
        rotateArrayRight(array, positions);

        // Output the rotated array
        System.out.println("Array after rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to rotate the array to the right by 'positions' positions
    public static void rotateArrayRight(int[] array, int positions) {
        int size = array.length;

        // Reverse the entire array
        reverseArray(array, 0, size - 1);

        // Reverse the first 'positions' elements
        reverseArray(array, 0, positions - 1);

        // Reverse the remaining elements
        reverseArray(array, positions, size - 1);
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

