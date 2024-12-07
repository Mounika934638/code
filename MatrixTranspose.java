public class MatrixTranspose {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Method to transpose the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length; // Number of rows in the original matrix
        int cols = matrix[0].length; // Number of columns in the original matrix

        // Create a new matrix with reversed dimensions (cols x rows)
        int[][] transposedMatrix = new int[cols][rows];

        // Copy elements to the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
