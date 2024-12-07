import java.util.Scanner;

public class CheckEqualMatrices {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns for the first matrix
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int cols1 = scanner.nextInt();

        // Input the number of rows and columns for the second matrix
        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if dimensions are the same
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices are not equal. They have different dimensions.");
            return;
        }

        // Create the two matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        // Input elements for the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Compare the two matrices
        boolean areEqual = true;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    areEqual = false;
                    break;
                }
            }
            if (!areEqual) {
                break;
            }
        }

        // Output the result
        if (areEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
