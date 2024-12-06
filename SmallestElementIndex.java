public class SmallestElementIndex {
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 12, 8, 20, 15, 30, 45};

        // Calling the method to find the index of the smallest element
        int index = findSmallestElementIndex(arr);

        // Output the result
        if (index != -1) {
            System.out.println("The index of the smallest element is: " + index);
        } else {
            System.out.println("Array is empty.");
        }
    }

    // Method to find the index of the smallest element in the array
    public static int findSmallestElementIndex(int[] arr) {
        // Check if the array is empty
        if (arr.length == 0) {
            return -1;  // Return -1 if the array is empty
        }

        // Initialize the smallest element and its index
        int smallest = arr[0];
        int index = 0;

        // Traverse the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;  // Update index when a
