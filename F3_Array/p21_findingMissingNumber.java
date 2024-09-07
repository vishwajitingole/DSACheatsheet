package F3_Array;

public class p21_findingMissingNumber {
    public int missingNumber(int[] nums) {
        // Calculate N from the length of nums
        int N = nums.length;

        // Summation of first N natural numbers
        int sum1 = (N * (N + 1)) / 2;

        // Summation of all elements in nums
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }

        // Calculate the missing number
        int missingNum = sum1 - sum2;

        // Return the missing number
        return missingNum;
    }
}
