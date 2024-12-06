import java.util.Scanner;

public class MergeArrays {
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

        // Create a new array to hold the merged result
        int[] mergedArray = new int[size1 + size2];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array to the merged array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        // Output the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}

