import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Check if the size is valid for finding second largest
        if (size < 2) {
            System.out.println("Array must have at least two elements to find the second largest element.");
            return; // Exit the program if the array is too small
        }

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the method to find the second largest element
        int secondLargest = findSecondLargest(array);

        // Output the second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array once
        for (int num : array) {
            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest; // Update second largest before largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest
            }
        }

        return secondLargest;
    }
}




























