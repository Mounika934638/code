import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Finding the union of the two arrays
        int[] result = findUnion(arr1, arr2);

        // Print the result
        System.out.print("Union of Arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to find the union of two arrays
    public static int[] findUnion(int[] arr1, int[] arr2) {
        // Create a HashSet to store unique elements from both arrays
        Set<Integer> set = new HashSet<>();

        // Add all elements of arr1 to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements of arr2 to the set
        for (int num : arr2) {
            set.add(num);
        }

        // Convert the HashSet to an array and return it
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}
