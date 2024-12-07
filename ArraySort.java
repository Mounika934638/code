import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // Example array
        int[] array = {5, 2, 9, 1, 5, 6};

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }
}
