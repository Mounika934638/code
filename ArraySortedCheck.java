import java.util.Scanner;

public class ArraySortedCheck {
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

        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                isSorted = false;
                break;
            }
        }

        // Output the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        // Close the scanner
        scanner.close();
    }
}

