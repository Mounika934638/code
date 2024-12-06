public class BinarySearch {
    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 70, 80, 90};

        // Target element to search
        int target = 40;

        // Calling binarySearch method
        int result = binarySearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Calculate middle index
            int mid = low + (high - low) / 2;

            // Check if the target element is at mid
            if (arr[mid] == target) {
                return mid; // Return the index of the target
            }

            // If target is smaller, ignore the right half
            if (arr[mid] > target) {
                high = mid - 1;
            } 
            // If target is larger, ignore the left half
            else {
                low = mid + 1;
            }
        }

        // Target not found
        return -1;
    }
}
