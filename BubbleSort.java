import java.util.Arrays;

public class BubbleSort {

    // Bubble Sort function
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap if the element is greater than the next
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main function to test the Bubble Sort implementation
    public static void main(String[] args) {
        // Test array
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Call bubbleSort to sort the array
        bubbleSort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
