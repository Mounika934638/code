import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        // Example array
        int[] arr = {4, 5, 6, 4, 4, 5, 7, 8, 6, 4};

        // Calling the method to print frequency of each element
        printElementFrequency(arr);
    }

    // Method to print frequency of each element in the array
    public static void printElementFrequency(int[] arr) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and calculate frequency
        for (int num : arr) {
            // If the element is already in the map, increment its frequency
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
