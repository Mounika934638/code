import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates{
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

        // Create a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add elements of the array to the HashSet (duplicates will be automatically removed)
        for (int i = 0; i < size; i++) {
            uniqueElements.add(array[i]);
        }

        // Output the unique elements
        System.out.println("Array with duplicates removed:");
        for (Integer element : uniqueElements) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
 
