import java.util.Scanner;

public class CheckArraysIdentical {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Create the first array
        int[] array1 = new int[size1];

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Create the second array
        int[] array2 = new int[size2];

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check if the arrays are identical
        if (areArraysIdentical(array1, array2)) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if two arrays are identical
    public static boolean areArraysIdentical(int[] array1, int[] array2) {
        // Check if both arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Check if all corresponding elements are the same
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;  // Arrays are identical
    }
}
