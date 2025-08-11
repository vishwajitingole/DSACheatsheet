package F3_Array;

import java.util.HashMap;
import java.util.Map;

public class p14_MajorityElement {
    public static void main(String[] args) {
        // Majority elements means that the number appears more than n/2 times
        // Where n is size of that array
        // Boyer-Moore Voting Algorithm
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.print(majo(arr));
        
    }

    // Best Solution
     // Time Complexity : O(n)
    // Space Complexity : O(1) because it uses constant extra space which doesn't increases with size of an array
    public static int majo(int arr[]) {
        int element = 0;
        int count = 0;
      
        for(int val:arr){
            if(count==0){
                element=val;
                count=1;
            }
            else if(val==element){
                count++;
            }else{
                count--;
            }
        }

        int count2=0;

        for(int val:arr){
            if(element==val){
                count2++;
            }
        }
        return (count2>arr.length/2?element:-1);

    }

    // Better Solution 
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        /* Iterate through the map to
        find the majority element*/
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        
        // Return -1 if no majority element is found
        return -1;
    }
}
