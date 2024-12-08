import java.util.Arrays;

public class InsertionSort {

    // Insertion Sort function
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            int key = array[i];  // The element to be inserted into the sorted part
            int j = i - 1;
            
            // Move elements of array[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            // Insert the key after the elements have been shifted
            array[j + 1] = key;
        }
    }

    // Main function to test the Insertion Sort implementation
    public static void main(String[] args) {
        // Test array
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call insertionSort to sort the array
        insertionSort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
