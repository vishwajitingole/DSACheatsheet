package F7_Hashing;

import java.util.HashMap;

public class p2_secondHighest {
    public static int second(int nums[]){

        int res=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
      
        }
    
        for(int n:map.values()){
            if(n>max){
                res=max;
                max=n;
            }else if(n>res&&n<max){
                res=n;
            }
        }
        if(res==Integer.MIN_VALUE)
        return -1;

        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,1,12,2,1,2,1,1};
        System.out.print(second(arr));
    }
}
