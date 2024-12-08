import java.util.regex.*;

public class ValidNumber {
    
    // Method to check if a string is a valid number
    public static boolean isValidNumber(String str) {
        // Regular expression for a valid number
        String regex = "^[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?$";
        
        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);
        
        // Create a matcher object
        Matcher matcher = pattern.matcher(str);
        
        // Return whether the string matches the regular expression
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test cases to check if strings are valid numbers
        String[] testStrings = {
            "123",        // Valid integer
            "-123",       // Valid negative integer
            "+123",       // Valid positive integer
            "123.45",     // Valid floating-point number
            "-123.45",    // Valid negative floating-point number
            "+123.45",    // Valid positive floating-point number
            "1e10",       // Valid scientific notation
            "-1e-10",     // Valid negative scientific notation
            "abc",        // Invalid string
            "12a3",       // Invalid string with alphabet
            "123..45",    // Invalid floating-point
            "123e",       // Invalid scientific notation
            "1.2.3"       // Invalid number with multiple decimals
        };

        // Check each string and print if it is a valid number
        for (String test : testStrings) {
            if (isValidNumber(test)) {
                System.out.println(test + " is a valid number.");
            } else {
                System.out.println(test + " is NOT a valid number.");
            }
        }
    }
}
