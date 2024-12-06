public class Main18 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6};

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Index of the element to be replaced
        int indexToReplace = 3; // Example: replace the element at index 3 (4th element)
        int newValue = 100; // New value to replace at the index

        // Replace the element at the specified index
        if (indexToReplace >= 0 && indexToReplace < array.length) {
            array[indexToReplace] = newValue;
        }

        // Print modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
