public class MedianOfTwoSortedArrays {

    // Function to find the median of two sorted arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0, right = m;
        while (left <= right) {
            int partition1 = (left + right) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            // Handle edge cases where partition is at the start or end of arrays
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if we have found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If the combined length of the arrays is odd
                if ((m + n) % 2 != 0) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                right = partition1 - 1; // Move towards the left side
            } else {
                left = partition1 + 1; // Move towards the right side
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    // Main function to test the findMedianSortedArrays method
    public static void main(String[] args) {
        // Test arrays
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // Find and print the median
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of the two sorted arrays is: " + median);
    }
}
