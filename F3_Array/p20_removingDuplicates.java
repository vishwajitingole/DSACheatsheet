package F3_Array;

class Solution {
    // Function to remove duplicates from the array
    public int removeDuplicates(int[] nums) {
        // Edge case: if array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Initialize pointer for unique elements
        int i = 0;

        // Iterate through the array
        for (int j = 1; j < nums.length; j++) {
            /*
             * If current element is different
             * from the previous unique element
             */
            if (nums[i] != nums[j]) {
                /*
                 * Move to the next position in
                 * the array for the unique element
                 */
                i++;
                /*
                 * Update the current position
                 * with the unique element
                 */
                nums[i] = nums[j];
            }
        }

        // Return the number of unique elements
        return i + 1;
    }
}

public class p20_removingDuplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 3, 3 };

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call removeDuplicates to remove duplicates from nums
        int k = solution.removeDuplicates(nums);

        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
