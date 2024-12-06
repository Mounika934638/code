public class Main14 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the right sum
        int rightSum = 0;

        // Loop through the array from the right (last element to the first)
        for (int i = array.length - 1; i >= 0; i--) {
            rightSum += array[i];
        }

        // Calculate the average
        double average = (double) rightSum / array.length;

        // Print the right sum and the average
        System.out.println("Right sum of the array: " + rightSum);
        System.out.println("Average of the array: " + average);
    }
}
