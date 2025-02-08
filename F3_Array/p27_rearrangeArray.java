package F3_Array;

public class p27_rearrangeArray {
    public static void rearrange(int[] arr){
        int[] res=new int[arr.length];
        int posi=0;
        int negi=1;
        for(int val:arr){
            if(val<0){
                res[negi]=val;
                negi+=2;
            }else{
                res[posi]=val;
                posi+=2;
            }
        }
        for(int val:res){
            System.out.println(val+" ");
        }
    }
   public static void main(String arg[]){
    int[] arr={1,2,3,-1,-3,-2,2,3,-4};
    rearrange(arr);
   } 
}
