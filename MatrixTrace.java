import java.util.Scanner;

public class MatrixTrace {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix (it should be a square matrix)
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

        // Calculate the trace of the matrix
        int trace = calculateTrace(matrix, n);

        // Output the trace of the matrix
        System.out.println("The trace of the matrix is: " + trace);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the trace of the matrix
    public static int calculateTrace(int[][] matrix, int n) {
        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];  // Sum the diagonal elements
        }
        return trace;
    }
}
