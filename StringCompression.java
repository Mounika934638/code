import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to compress
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Compress the string
        String compressedString = compressString(input);

        // Output the compressed string
        System.out.println("Compressed String: " + compressedString);

        // Close the scanner
        scanner.close();
    }

    // Function to compress the string
    public static String compressString(String str) {
        // Edge case: if the string is empty, return it as it is
        if (str == null || str.length() == 0) {
            return str;
        }

        // StringBuilder to build the compressed string
        StringBuilder compressed = new StringBuilder();

        // Traverse the string
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append the previous character and its count
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                // Reset the count
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        // If the compressed string is longer than the original, return the original string
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
