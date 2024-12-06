public class Main17 {
    public static void main(String[] args) {
        // Example array
        int[] array = {12, 5, 7, 19, 3, 8, 10};

        // Initialize max with the first element of the array
        int max = array[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the maximum value
        System.out.println("Maximum number in the array: " + max);
    }
}
