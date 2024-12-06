public class Main11 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Check if the array has an odd or even number of elements
        int length = array.length;
        
        // If the array has an odd length, there's a single middle element
        if (length % 2 != 0) {
            int middleIndex = length / 2;
            System.out.println("Middle element: " + array[middleIndex]);
        } 
        // If the array has an even length, there are two middle elements
        else {
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            System.out.println("Middle elements: " + array[middleIndex1] + " and " + array[middleIndex2]);
        }
    }
}
