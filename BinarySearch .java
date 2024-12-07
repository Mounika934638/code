public class BinarySearch {
    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Target element to search
        int target = 7;

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;  // Start of the array
        int high = arr.length - 1;  // End of the array

        // Iterate while the search space is valid
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Calculate the middle index

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid;  // Target found at mid index
            }
            // If target is smaller, narrow the search to the left half
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            // If target is larger, narrow the search to the right half
            else {
                low = mid + 1;
            }
        }

        // Return -1 if the element is not found
        return -1;
    }
}
