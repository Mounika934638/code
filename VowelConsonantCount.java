import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to check
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the countVowelsAndConsonants function
        int[] result = countVowelsAndConsonants(input);

        // Output the counts of vowels and consonants
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

        // Close the scanner
        scanner.close();
    }

    // Function to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        // Initialize counts for vowels and consonants
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    // Otherwise, it's a consonant
                    consonantsCount++;
                }
            }
        }

        // Return an array with the counts of vowels and consonants
        return new int[]{vowelsCount, consonantsCount};
    }
}
