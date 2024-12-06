public class LinearSearch {
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 12, 8, 20, 15, 30, 45};

        // Target element to search
        int target = 20;

        // Calling linearSearch method
        int result = linearSearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            // If the target element is found, return the index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }
}
