public class Main19 {
    public static void main(String[] args) {
        // Example array
        int[] array = {10, 20, 30, 40, 50};

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Indices of the elements to swap
        int index1 = 1; // Index of first element (20)
        int index2 = 3; // Index of second element (40)

        // Swap the elements at index1 and index2
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            // Use a temporary variable to swap the values
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        // Print the modified array
        System.out.print("Modified array after swap: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
