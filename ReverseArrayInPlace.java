1.Print the First Half of an Array
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the midpoint of the array
        int mid = array.length / 2;

        // Loop through the first half of the array and print each element
        for (int i = 0; i < mid; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

Output:
=======

1 2 3 4 5

2.Print the Second Half of an Array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the midpoint of the array
        int mid = array.length / 2;

        // Loop through the second half of the array and print each element
        for (int i = mid; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
} 

Output:
=======

6 7 8 9 10

3.Program to print all ODD position elements

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array and print elements at odd positions (odd indices)
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
Output:
=======
2 4 6 8 10

4.Program to print all EVEN position elements

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array and print elements at even positions (even indices)
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
Output:
=======
1 3 5 7 9

5.Program to write array elements in reverse order
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array in reverse order and print each element
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
Output:
10 9 8 7 6 5 4 3 2 1

6.Print Array First half reverse direction

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the midpoint of the array
        int mid = array.length / 2;

        // Loop through the first half of the array in reverse order and print each element
        for (int i = mid - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
5 4 3 2 1

7.Print Array Second half reverse direction

public class Main {
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
output:
10 9 8 7 6

8.Print Array even positions in reverse order

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array, but only consider elements at even indices, in reverse order
        for (int i = array.length - 2; i >= 0; i -= 2) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
10 8 6 4 2

9.Print Array ODD positions in reverse order

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Loop through the array, but only consider elements at odd indices, in reverse order
        for (int i = array.length - 1; i >= 1; i -= 2) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
10 8 6 4 2

10.Program to print first and last element of an array.

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the first element (index 0)
        System.out.println("First element: " + array[0]);

        // Print the last element (index array.length - 1)
        System.out.println("Last element: " + array[array.length - 1]);
    }
}
output:
First element: 1
Last element: 10

11.Print middle values of an Array

public class Main {
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
output:
Middle element: 5
Middle elements: 4 and 5

12.Program to print the sum of Array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Print the sum of the array
        System.out.println("Sum of the array: " + sum);
    }
}
output:
Sum of the array: 55

13.Program to print sum and average of an Array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Print the sum and the average
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}
output:
Sum of the array: 55
Average of the array: 5.5

14.Program to print the right sum and average of an Array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the right sum
        int rightSum = 0;

        // Loop through the array from the right (last element to the first)
        for (int i = array.length - 1; i >= 0; i--) {
            rightSum += array[i];
        }

        // Calculate the average
        double average = (double) rightSum / array.length;

        // Print the right sum and the average
        System.out.println("Right sum of the array: " + rightSum);
        System.out.println("Average of the array: " + average);
    }
}
output:
Right sum of the array: 55
Average of the array: 5.5

15.Program to print sum and average of Left (first half) array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the midpoint of the array
        int mid = array.length / 2;

        // Variable to store the sum of the first half
        int sum = 0;

        // Loop through the first half of the array
        for (int i = 0; i < mid; i++) {
            sum += array[i];
        }

        // Calculate the average of the first half
        double average = (double) sum / mid;

        // Print the sum and average of the first half of the array
        System.out.println("Sum of the first half of the array: " + sum);
        System.out.println("Average of the first half of the array: " + average);
    }
}
output:
Sum of the first half of the array: 15
Average of the first half of the array: 3.0

16.Find the minimum number of the Array
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {12, 5, 7, 19, 3, 8, 10};

        // Initialize min with the first element of the array
        int min = array[0];

        // Loop through the array to find the minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the minimum value
        System.out.println("Minimum number in the array: " + min);
    }
}
output:
Minimum number in the array: 3

17.Find the maximum number of arrays
public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {12, 5, 7, 19, 3, 8, 10};

        // Initialize max with the first element of the array
        int max = array[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the maximum value
        System.out.println("Maximum number in the array: " + max);
    }
}
output:
Maximum number in the array: 19

18.Program to replace any element within array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6};

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Index of the element to be replaced
        int indexToReplace = 3; // Example: replace the element at index 3 (4th element)
        int newValue = 100; // New value to replace at the index

        // Replace the element at the specified index
        if (indexToReplace >= 0 && indexToReplace < array.length) {
            array[indexToReplace] = newValue;
        }

        // Print modified array
        System.out.print("Modified array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
Original array: 1 2 3 4 5 6 
Modified array: 1 2 3 100 5 6

19.Program to swap 2 array elements 

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] array = {10, 20, 30, 40, 50};

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Indices of the elements to swap
        int index1 = 1; // Index of first element (20)
        int index2 = 3; // Index of second element (40)

        // Swap the elements at index1 and index2
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            // Use a temporary variable to swap the values
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        // Print the modified array
        System.out.print("Modified array after swap: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
Original array: 10 20 30 40 50 
Modified array after swap: 10 40 30 20 50 

20.Read the array values from the keyboard

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Ask the user to input values for the array
        System.out.println("Enter " + size + " elements for the array:");

        // Loop to read the array elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();  // Read an integer and store it in the array
        }

        // Print the array values
        System.out.println("Array values are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
output:
Enter the size of the array: 5
Enter 5 elements for the array:
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50
Array values are:
10 20 30 40 50

21.Initialize array at the time of declaration.

public class Main {
    public static void main(String[] args) {
        // Initialize an integer array at the time of declaration
        int[] array = {10, 20, 30, 40, 50};

        // Print the array values
        System.out.print("Array values: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
output:

22. Program to Find the Largest Element in an Array

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize the largest element to the first element of the array
        int largest = array[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        scanner.close();
    }
}

23. Program to Find the Smallest Element in an Array

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize the smallest element to the first element of the array
        int smallest = array[0];

        // Traverse the array to find the smallest element
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the smallest element
        System.out.println("The smallest element in the array is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}

24. Program to Count the Occurrence of Each Element in an Array

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesInArray {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array and count the occurrences of each element
        for (int i = 0; i < size; i++) {
            int element = array[i];
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        // Output the occurrence of each element
        System.out.println("Occurrences of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " time(s).");
        }

        // Close the scanner
        scanner.close();
    }
}

25. Program to Check if an Array is Sorted

import java.util.Scanner;

public class ArraySortedCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                isSorted = false;
                break;
            }
        }

        // Output the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        // Close the scanner
        scanner.close();
    }
}

26. Program to Merge Two Arrays

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Create the first array
        int[] array1 = new int[size1];

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the size of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Create the second array
        int[] array2 = new int[size2];

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Create a new array to hold the merged result
        int[] mergedArray = new int[size1 + size2];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array to the merged array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        // Output the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}

27. Program to Remove Duplicate Elements from an Array

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Add elements of the array to the HashSet (duplicates will be automatically removed)
        for (int i = 0; i < size; i++) {
            uniqueElements.add(array[i]);
        }

        // Output the unique elements
        System.out.println("Array with duplicates removed:");
        for (Integer element : uniqueElements) {
            System.out.print(element + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
 
28. Program to Rotate an Array by a Given Number of Positions

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number of positions to rotate
        System.out.print("Enter the number of positions to rotate: ");
        int positions = scanner.nextInt();

        // Normalize the positions if they are greater than the size of the array
        positions = positions % size;  // In case of rotations larger than the array size

        // Rotate the array to the right
        rotateArrayRight(array, positions);

        // Output the rotated array
        System.out.println("Array after rotation:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to rotate the array to the right by 'positions' positions
    public static void rotateArrayRight(int[] array, int positions) {
        int size = array.length;

        // Reverse the entire array
        reverseArray(array, 0, size - 1);

        // Reverse the first 'positions' elements
        reverseArray(array, 0, positions - 1);

        // Reverse the remaining elements
        reverseArray(array, positions, size - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

29. Program to Reverse an Array Without Using Another Array

import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Reverse the array in-place
        reverseArray(array);

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to reverse the array in-place
    public static void reverseArray(int[] array) {
        int start = 0;         // Start index of the array
        int end = array.length - 1;  // End index of the array

        // Swap the elements from both ends towards the center
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
    }
}
30. Program to Find the Second Largest Element in an Array

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Check if the size is valid for finding second largest
        if (size < 2) {
            System.out.println("Array must have at least two elements to find the second largest element.");
            return; // Exit the program if the array is too small
        }

        // Create the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Call the method to find the second largest element
        int secondLargest = findSecondLargest(array);

        // Output the second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array once
        for (int num : array) {
            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest; // Update second largest before largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest
            }
        }

        return secondLargest;
    }
}






































