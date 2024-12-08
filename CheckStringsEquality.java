import java.util.Scanner;

public class CheckStringsEquality {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the lengths are the same
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not equal.");
        } else {
            // Compare each character in the strings
            boolean areEqual = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }

            // Output the result
            if (areEqual) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
