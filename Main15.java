public class Main15 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the midpoint of the array
        int mid = array.length / 2;

        // Variable to store the sum of the first half
        int sum = 0;

        // Loop through the first half of the array
        for (int i = 0; i < mid; i++) {
            sum += array[i];
        }

        // Calculate the average of the first half
        double average = (double) sum / mid;

        // Print the sum and average of the first half of the array
        System.out.println("Sum of the first half of the array: " + sum);
        System.out.println("Average of the first half of the array: " + average);
    }
}
