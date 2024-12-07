public class PalindromeArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 2, 1};

        // Checking if the array is palindrome
        boolean result = isPalindrome(arr);

        // Output the result
        if (result) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    // Method to check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Compare elements from both ends of the array
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;  // If any pair of elements do not match, return false
            }
            left++;
            right--;
        }

        // If all pairs matched, return true
        return true;
    }
}
