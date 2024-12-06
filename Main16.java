public class Main16 {
    public static void main(String[] args) {
        // Example array
        int[] array = {12, 5, 7, 19, 3, 8, 10};

        // Initialize min with the first element of the array
        int min = array[0];

        // Loop through the array to find the minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the minimum value
        System.out.println("Minimum number in the array: " + min);
    }
}
