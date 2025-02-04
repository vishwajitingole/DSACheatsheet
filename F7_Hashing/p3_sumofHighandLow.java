package F7_Hashing;

import java.util.HashMap;

public class p3_sumofHighandLow {
   
    public int sumHighestAndLowestFrequency(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;

      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
      }

      for( int n:map.values()){
        if(n>max){
            max=n;
        }
        if(n<min){
            min=n;
        }
      }



      return min+max;
    }


}
