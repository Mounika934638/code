public class MajorityElement {
    public static void main(String[] args) {
        // Example array
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        // Calling the method to find the majority element
        int majority = findMajorityElement(arr);

        // Output result
        if (majority != -1) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Method to find the majority element using Boyer-Moore Voting Algorithm
    public static int findMajorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        // First pass to find the candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Second pass to confirm the candidate is actually the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // If the candidate appears more than n/2 times, it is the majority element
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;  // No majority element
        }
    }
}
