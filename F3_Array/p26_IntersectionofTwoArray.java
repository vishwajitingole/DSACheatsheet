package F3_Array;

import java.util.HashSet;
import java.util.Set;

public class p26_IntersectionofTwoArray {
    public static void intersect(int nums1[],int nums2[]){
        Set<Integer>temp=new HashSet<>();
        Set<Integer> res=new HashSet<>();

        for(int i:nums1){
            temp.add(i);
        }
        for(int j:nums2){
            if(temp.contains(j)){
                res.add(j);
            }
            temp.add(j);
        }

        for(int k:res){
            System.out.print(k+" ");
        }


    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,2};
        int arr2[]={4,2,3,7,8,9};
        intersect(arr,arr2);
    }
}
