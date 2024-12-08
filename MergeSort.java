import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int[] array) {
        // Base case: if the array has only one element, it's already sorted
        if (array.length <= 1) {
            return;
        }

        // Split the array into two halves
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Merge two sorted arrays into the original array
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from the left and right sub-arrays and add the smaller one to the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // If there are remaining elements in the left sub-array, add them
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // If there are remaining elements in the right sub-array, add them
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main function to test the Merge Sort implementation
    public static void main(String[] args) {
        // Test array
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Call mergeSort
        mergeSort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
