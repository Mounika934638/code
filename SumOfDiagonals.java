public class SumOfDiagonals {
    public static void main(String[] args) {
        // Example 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Find the sum of diagonal elements
        int sum = sumOfDiagonals(matrix);

        // Output the result
        System.out.println("Sum of diagonal elements: " + sum);
    }

    // Method to find the sum of diagonal elements
    public static int sumOfDiagonals(int[][] matrix) {
        int n = matrix.length;  // Number of rows (and columns, assuming square matrix)
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];  // Add primary diagonal element
            sum += matrix[i][n - 1 - i];  // Add secondary diagonal element
        }

        // If the matrix has an odd size, the middle element was added twice, so subtract it once
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];  // Subtract the middle element (which was counted twice)
        }

        return sum;
    }
}
