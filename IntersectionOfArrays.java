import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Finding the intersection of the two arrays
        int[] result = findIntersection(arr1, arr2);

        // Print the result
        System.out.print("Intersection of Arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to find the intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Create a HashSet to store elements of the first array
        Set<Integer> set1 = new HashSet<>();

        // Add all elements of arr1 to the HashSet
        for (int num : arr1) {
            set1.add(num);
        }

        // Create a list to store the common elements (intersection)
        List<Integer> intersection = new ArrayList<>();

        // Traverse the second array and check if the element exists in set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);  // If common, add to intersection list
                set1.remove(num);  // Remove to avoid duplicates in the intersection
            }
        }

        // Convert the List to an array and return the result
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
