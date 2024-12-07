import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescending {
    public static void main(String[] args) {
        // Example array
        Integer[] array = {5, 2, 9, 1, 5, 6};

        // Sort the array in descending order using Arrays.sort() with a custom comparator
        Arrays.sort(array, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
    }
}
