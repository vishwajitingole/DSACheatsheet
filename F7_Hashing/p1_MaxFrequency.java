package F7_Hashing;

import java.util.HashMap;

public class p1_MaxFrequency {
    public static int totalFreq(int nums[]){
        int totalFreq=0;
        int max=0;

        HashMap<Integer,Integer>copy=new HashMap<>();

        for(int n:nums){
            if(copy.containsKey(n)){
                copy.put(n, copy.get(n)+1);
            }else{
                copy.put(n, 1);
            }

            max=Math.max(copy.get(n), max);
        }

        for(int n:copy.values()){
            if(max==n){
                totalFreq+=n;
            }
        }

        return totalFreq;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      System.out.print(  totalFreq(arr));
    }
}