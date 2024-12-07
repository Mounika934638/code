import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Finding common elements
        findCommonElements(arr1, arr2);
    }

    // Method to find common elements between two arrays
    public static void findCommonElements(int[] arr1, int[] arr2) {
        // Create a HashSet to store elements of the first array
        Set<Integer> set = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Print the common elements
        System.out.println("Common Elements:");
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " "); // If element exists in set, it's a common element
                set.remove(num);  // To prevent duplicates in the output
            }
        }
        System.out.println();
    }
}
