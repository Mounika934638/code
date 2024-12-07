public class SumOf2DArray {
    public static void main(String[] args) {
        // Example 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call method to calculate the sum of all elements
        int sum = sumOfElements(matrix);

        // Print the sum
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }

    // Method to calculate the sum of all elements in a 2D array
    public static int sumOfElements(int[][] matrix) {
        int sum = 0;

        // Traverse each row and column and sum the elements
        for (int i = 0; i < matrix.length; i++) {         // Iterate over rows
            for (int j = 0; j < matrix[i].length; j++) {  // Iterate over columns
                sum += matrix[i][j];  // Add element to sum
            }
        }

        return sum;  // Return the total sum
    }
}
