public class SymmetricMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        // Check if the matrix is symmetric
        boolean isSymmetric = isSymmetricMatrix(matrix);

        // Output the result
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }

    // Method to check if the matrix is symmetric
    public static boolean isSymmetricMatrix(int[][] matrix) {
        int n = matrix.length;  // Number of rows (and columns) in the square matrix

        // Check if the matrix is square
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;  // Not a square matrix
            }
        }

        // Check if matrix is equal to its transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // Start from j = i to avoid redundant checks
                if (matrix[i][j] != matrix[j][i]) {
                    return false;  // Matrix is not symmetric
                }
            }
        }

        return true;  // Matrix is symmetric
    }
}
