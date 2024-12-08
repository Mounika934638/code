import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the string to check
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the isPalindrome function
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Initialize pointers to compare characters from both ends of the string
        int left = 0;
        int right = str.length() - 1;

        // Compare characters while moving towards the center
        while (left < right) {
            // Skip non-alphanumeric characters (if you want to ignore spaces, punctuation, etc.)
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else {
                // If characters don't match, return false
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                // Move pointers towards the center
                left++;
                right--;
            }
        }

        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
