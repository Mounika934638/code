import java.util.Scanner;

public class CheckNumberInArray {
    public static void main(String[] args) {
        // Initialize scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Example array
        int[] arr = {5, 12, 8, 20, 15, 30, 45};

        // Ask the user for the number to search for
        System.out.print("Enter the number to search: ");
        int number = scanner.nextInt();
        
        // Call method to check if the number is present in the array
        boolean isPresent = isNumberPresent(arr, number);
        
        // Output result
        if (isPresent) {
            System.out.println("The number " + number + " is present in the array.");
        } else {
            System.out.println("The number " + number + " is not present in the array.");
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to check if the number is present in the array
    public static boolean isNumberPresent(int[] arr, int number) {
        // Iterate through the array to check for the number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;  // If found, return true
            }
        }
        return false;  // If not found, return false
    }
}
