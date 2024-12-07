import java.util.Scanner;

public class ReplaceNegativeWithZero {
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

        // Replace negative numbers with 0
        replaceNegativeWithZero(array);

        // Output the modified array
        System.out.println("Array after replacing negative numbers with 0:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to replace all negative numbers with 0
    public static void replaceNegativeWithZero(int[] array) {
        // Traverse the array
        for (int i = 0; i < array.length; i++) {
            // If the element is negative, replace it with 0
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }
}
