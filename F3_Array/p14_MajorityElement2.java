package F3_Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class p14_MajorityElement2 {
    
    public static void main(String[] args) {
        // Here 
        // Return all elements which appear more than n/3 times in the array.
        int arr[]= {1, 2, 1, 1, 3, 2, 2};
        
        System.out.println(majo(arr));
    }
    public static List<Integer> majo(int[] arr){

        List<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
         
        for(int val:arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val, 1);
            }
        }


        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue()>arr.length/3){
                ans.add(mp.getKey());
            }
        }


        return ans;
    }
}
