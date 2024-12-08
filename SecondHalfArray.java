import java.util.Scanner;

public class SecondHalfArray {
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

        // Calculate the midpoint of the array
        int mid = size / 2;

        // If the array size is odd, the second half starts from the midpoint
        // If the array size is even, the second half starts from mid
        // Print the second half of the array
        System.out.println("Second half of the array:");
        for (int i = mid; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
