import java.util.Scanner;

public class SumOddEvenNumbers {
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

        // Calculate the sum of odd and even numbers
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];  // Add to even sum if the number is even
            } else {
                sumOdd += array[i];   // Add to odd sum if the number is odd
            }
        }

        // Output the sums
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

         // Close the scanner
        scanner.close();
    }
}
