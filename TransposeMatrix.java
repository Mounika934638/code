import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns of the matrix
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][cols];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create the transposed matrix
        int[][] transpose = new int[cols][rows];

        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Swap rows and columns
            }
        }

        // Output the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
