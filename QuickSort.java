import java.util.Arrays;

public class QuickSort {

    // Quick Sort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot element such that elements smaller than pivot are on the left, 
            // and elements greater than pivot are on the right
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);  // Left sub-array
            quickSort(array, pivotIndex + 1, high); // Right sub-array
        }
    }

    // Partition function to reorder the array around the pivot
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choose the last element as pivot
        int i = low - 1; // Index of the smaller element

        // Traverse the array and reorder it around the pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;  // Increment the index of smaller element
                // Swap the elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at (i + 1)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index where the pivot is now placed
        return i + 1;
    }

    // Main function to test the Quick Sort implementation
    public static void main(String[] args) {
        // Test array
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call quickSort with the full array
        quickSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
