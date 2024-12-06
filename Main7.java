public class Main7 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the midpoint of the array
        int mid = array.length / 2;

        // Loop through the second half of the array in reverse order and print each element
        for (int i = array.length - 1; i >= mid; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
