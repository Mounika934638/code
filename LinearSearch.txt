public class LinearSearch {
    public static void main(String[] args) {
        // Example array
        int[] arr = {23, 34, 12, 45, 56, 78, 89};

        // Target element to search
        int target = 45;

        // Perform linear search
        int result = linearSearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return index if element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }
}
