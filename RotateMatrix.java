import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix (square matrix)
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[n][n];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix 90 degrees clockwise
        rotateMatrix(matrix, n);

        // Output the rotated matrix
        System.out.println("Matrix after rotation by 90 degrees:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix
        transpose(matrix, n);

        // Step 2: Reverse each row of the matrix
        reverseRows(matrix, n);
    }

    // Function to transpose the matrix
    public static void transpose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with element at (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Function to reverse each row of the matrix
    public static void reverseRows(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            // Reverse the row
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
