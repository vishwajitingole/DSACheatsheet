package F16_DynamicProgramming;

import java.util.Arrays;

public class p2_FrogJumps {
      private int solve(int ind, int[] heights, int[] dp) {
        // yahi pe rukjaa 
        if (ind == 0) return 0; 
        // Bas yaad rakhna apne paas hai already
        if (dp[ind] != -1) return dp[ind]; 

        int jumpOne = solve(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (ind > 1)
            jumpTwo = solve(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);
        // Stored akrke rakhta hun baadmein reuse karunga 
        return dp[ind] = Math.min(jumpOne, jumpTwo); 
    }

    public int frogJump(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        // 0 index se shuru
        return solve(n - 1, heights, dp); 
    }

    public static void main(String[] args) {
        int[] heights = {30, 10, 60, 10, 60, 50};
        p2_FrogJumps sol = new p2_FrogJumps();
        // Output the result
        System.out.println(sol.frogJump(heights)); 
    }
}


