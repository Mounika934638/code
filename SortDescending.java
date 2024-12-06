import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        // Example array
        Integer[] arr = {5, 2, 8, 1, 3};

        // Sorting the array in descending order using Arrays.sort()
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}
