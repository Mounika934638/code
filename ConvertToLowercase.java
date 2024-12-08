import java.util.Scanner;

public class ConvertToLowercase {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to convert
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = input.toLowerCase();

        // Output the string in lowercase
        System.out.println("String in lowercase: " + lowercaseString);

        // Close the scanner
        scanner.close();
    }
}
