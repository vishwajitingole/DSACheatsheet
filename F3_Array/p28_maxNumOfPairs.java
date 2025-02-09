package F3_Array;

import java.util.Arrays;

public class p28_maxNumOfPairs {
    public static void pairs(int arr[]){

        Arrays.sort(arr);
        int equal=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                equal++;
                i++;
            }
        }
        //Basic common sense formula to calculate remaining non paired elements
        int remaining=arr.length-(2*equal);

        System.out.println("Remaining :"+remaining);
        System.out.println("Pairs : "+equal);

    }
    public static void main(String arg[]){
        int arr[]={1,2,3,1,2,3,4,5};
        pairs(arr);
    }
}
