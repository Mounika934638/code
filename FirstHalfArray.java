import java.util.Scanner;

public class FirstHalfArray {
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

        // Print the first half of the array
        System.out.println("First half of the array:");
        for (int i = 0; i < mid; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
