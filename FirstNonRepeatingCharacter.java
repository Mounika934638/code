import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to find the first non-repeating character
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Output the result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String str) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == 1) {
                return str.charAt(i);  // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return '\0'
        return '\0';
    }
}
