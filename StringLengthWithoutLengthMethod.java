import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to find the length
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the length of the string without using length() method
        int length = findStringLength(input);

        // Output the length of the string
        System.out.println("The length of the string is: " + length);

        // Close the scanner
        scanner.close();
    }

    // Function to find the length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        
        // Iterate through each character of the string
        while (true) {
            try {
                // Try accessing each character in the string
                str.charAt(count);
                count++; // Increment the count for each character
            } catch (StringIndexOutOfBoundsException e) {
                // When we reach the end of the string, an exception is thrown
                break;
            }
        }

        return count; // Return the count as the length of the string
    }
}
