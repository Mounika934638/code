public class MatrixMultiplication {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        // Perform matrix multiplication
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Print the result matrix
        if (result != null) {
            System.out.println("Resulting Matrix:");
            printMatrix(result);
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;          // Number of rows in matrix A
        int colsA = A[0].length;       // Number of columns in matrix A
        int rowsB = B.length;          // Number of rows in matrix B
        int colsB = B[0].length;       // Number of columns in matrix B

        // Check if multiplication is possible (columns of A must equal rows of B)
        if (colsA != rowsB) {
            return null;  // Return null if multiplication is not possible
        }

        // Create a result matrix with dimensions rowsA x colsB
        int[][] result = new int[rowsA][colsB];

        // Perform the multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                // Calculate the dot product of the i-th row of A and j-th column of B
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
