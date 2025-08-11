package F3_Array;

public class p31_MaxProductSubArray {
     /**
     * Finds the maximum product of a CONTIOUS subarray in the given array.
     * 
     * @param nums the input array of integers
     * @return the maximum product of any subarray
     */
    public int maxProduct(int[] nums) {
        // prefix product: product of elements from the start up to current index
        int prefix = 1;
        // suffix product: product of elements from the end up to current index
        int suffix = 1;
        // Initialize result with the smallest possible integer value
        int result = Integer.MIN_VALUE;

        int n = nums.length;

        // Traverse the array from left to right and from right to left simultaneously
        for(int i = 0; i < n; i++){
            
            // If prefix becomes zero, reset it to 1
            // This means we start a new subarray product calculation
            if(prefix == 0){
                prefix = 1;
            }
            // Similarly reset suffix if it becomes zero
            if(suffix == 0){
                suffix = 1;
            }

            // Multiply prefix by current element from the left
            prefix *= nums[i];
            // Multiply suffix by current element from the right
            suffix *= nums[n - 1 - i];

            // Update the result with the maximum of:
            // - current result
            // - current prefix product
            // - current suffix product
            // This way, both left-to-right and right-to-left products are considered
            result = Math.max(result, Math.max(prefix, suffix));
        }

        return result;
    }
}
