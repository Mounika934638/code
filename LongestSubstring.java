import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        // Create a hash set to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        // Initialize pointers and variables
        int start = 0, maxLength = 0;
        
        // Iterate through the string with the end pointer
        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the set, move the start pointer
            // to the right until the duplicate is removed
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(end));
            
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        // Return the maximum length of the substring without repeating characters
        return maxLength;
    }

    public static void main(String[] args) {
        // Test the method with some examples
        String testString = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(testString));

        testString = "bbbbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(testString));

        testString = "pwwkew";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(testString));

        testString = "";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(testString));
    }
}
