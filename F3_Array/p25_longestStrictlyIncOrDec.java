package F3_Array;

public class p25_longestStrictlyIncOrDec {
    public static int longincdec(int nums[]){

if(nums.length==1) return 1;

        int inc=1;
        int dec=1;
        int maxLen=1;


        for( int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                inc++;
                dec=1;
            }else if(nums[i+1]<nums[i]){
                dec++;
                inc=1;
            }
            maxLen=Math.max(maxLen,Math.max(inc,dec));
        }


        return maxLen;
    }
    public static void main(String arg[]){
        int arr[]={10, 20, 30, 5, 4, 3};
        System.out.print(longincdec(arr));
    }
}
