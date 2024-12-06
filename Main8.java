public class Main8 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array, but only consider elements at even indices, in reverse order
        for (int i = array.length - 2; i >= 0; i -= 2) {
            System.out.print(array[i] + " ");
        }
    }
}
