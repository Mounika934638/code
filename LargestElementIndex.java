public class LargestElementIndex {
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 12, 8, 20, 15, 30, 45};

        // Calling the method to find the index of the largest element
        int index = findLargestElementIndex(arr);

        // Output the result
        if (index != -1) {
            System.out.println("The index of the largest element is: " + index);
        } else {
            System.out.println("Array is empty.");
        }
    }

    // Method to find the index of the largest element in the array
    public static int findLargestElementIndex(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            return -1;  // Return -1 if the array is empty
        }

        // Initialize the largest element and its index
        int largest = arr[0];
        int index = 0;

        // Traverse the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;  // Update index when a new largest element is found
            }
        }

        // Return the index of the largest element
        return index;
    }
}
