import java.util.HashSet;

public class FirstDuplicateElement {

    // Function to find the first duplicate element in an array
    public static int findFirstDuplicate(int[] array) {
        // Create a set to track elements we've seen
        HashSet<Integer> seen = new HashSet<>();

        // Traverse the array
        for (int num : array) {
            // If the number is already in the set, it's a duplicate
            if (seen.contains(num)) {
                return num; // Return the first duplicate found
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }

        // If no duplicates are found, return -1 (or any other indicator)
        return -1;
    }

    // Main method to test the findFirstDuplicate function
    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {1, 2, 3, 4, 5, 6, 2, 7};
        System.out.println("First duplicate in array1: " + findFirstDuplicate(array1));

        // Test case 2
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("First duplicate in array2: " + findFirstDuplicate(array2));
    }
}
