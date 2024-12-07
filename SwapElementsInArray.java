public class SwapElementsInArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original Array:");
        printArray(arr);

        // Indices of elements to swap
        int index1 = 1; // Element at index 1
        int index2 = 3; // Element at index 3

        // Swap elements at index1 and index2
        swapElements(arr, index1, index2);

        // Print modified array
        System.out.println("Array After Swap:");
        printArray(arr);
    }

    // Method to swap two elements in an array
    public static void swapElements(int[] arr, int index1, int index2) {
        // Check if indices are valid
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            // Swap the elements
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("Invalid indices.");
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
