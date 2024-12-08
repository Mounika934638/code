import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to remove whitespaces
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove whitespaces from the string
        String result = removeWhitespaces(input);

        // Output the result
        System.out.println("String after removing whitespaces: " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to remove all whitespaces from a string
    public static String removeWhitespaces(String str) {
        // Replace all whitespaces with an empty string
        return str.replaceAll("\\s+", "");
    }
}
