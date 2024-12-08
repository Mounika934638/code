import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to count words
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the countWords function
        int wordCount = countWords(input);

        // Output the word count
        System.out.println("Number of words: " + wordCount);

        // Close the scanner
        scanner.close();
    }

    // Function to count the number of words in a string
    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Check if the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Split the string by spaces using a regular expression
        String[] words = str.split("\\s+");

        // Return the number of words
        return words.length;
    }
}
