import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to convert
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to uppercase
        String uppercaseString = input.toUpperCase();

        // Output the string in uppercase
        System.out.println("String in uppercase: " + uppercaseString);

        // Close the scanner
        scanner.close();
    }
}
