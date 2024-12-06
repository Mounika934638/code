public class Main13 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Print the sum and the average
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}
