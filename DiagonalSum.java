public class DiagonalSum {
    public static void main(String[] args) {
        // Example matrix (square matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Calling the method to calculate the sum of diagonal elements
        int sum = sumOfDiagonals(matrix);
        
        // Printing the result
        System.out.println("Sum of diagonal elements: " + sum);
    }

    public static int sumOfDiagonals(int[][] matrix) {
        int n = matrix.length;  // Size of the square matrix
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            // Primary diagonal: matrix[i][i]
            sum += matrix[i][i];
            
            // Secondary diagonal: matrix[i][n-i-1]
            if (i != n - i - 1) { // To avoid double-counting the center element in odd-sized matrix
                sum += matrix[i][n - i - 1];
            }
        }
        
        return sum;
    }
}
