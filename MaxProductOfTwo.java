import java.util.Scanner;

public class MaxProductOfTwo {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the function to find the maximum product of two elements
        int maxProduct = findMaxProduct(array);

        // Output the result
        System.out.println("The maximum product of two elements in the array is: " + maxProduct);

        // Close the scanner
        scanner.close();
    }

    // Function to find the maximum product of two elements in the array
    public static int findMaxProduct(int[] array) {
        // Edge case: If the array has less than 2 elements, we can't find a product
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        // Initialize variables to track the largest and second largest positive numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Initialize variables to track the smallest and second smallest negative numbers
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        // Traverse the array to find the max1, max2, min1, and min2
        for (int num : array) {
            // Update max1 and max2
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update min1 and min2
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // The maximum product will be the maximum of:
        // 1) Product of two largest positive numbers
        // 2) Product of two smallest negative numbers
        return Math.max(max1 * max2, min1 * min2);
    }
}
