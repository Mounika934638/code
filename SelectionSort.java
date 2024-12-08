import java.util.Arrays;

public class SelectionSort {

    // Selection Sort function
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Traverse through all elements of the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the remaining unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at the current position
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    // Main function to test the Selection Sort implementation
    public static void main(String[] args) {
        // Test array
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call selectionSort to sort the array
        selectionSort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
