package F3_Array;

public class p12_trappingRainWater {
    public static void main(String[] args) {
        int arr[] = { 4,2,0,6,3,2,5 };
        trapping(arr);
    }

    public static void trapping(int height[]) {
        int n = height.length;
         if (n == 0) return;

       int left[]=new int[n];
       left[0]=height[0];
       for (int i = 1; i < n ; i++) {
           left[i] = Math.max(left[i - 1], height[i]);
       }
        

       int right[] = new int[n];
       right[n-1] = height[n-1];
       for (int j = n - 2; j >= 0; j--) {
           right[j] = Math.max(right[j + 1], height[j]);
       }

       int waterlevel = 0;
       for (int k = 0; k < n; k++) {
           waterlevel += Math.min(left[k], right[k]) - height[k];
       }

       System.out.println(waterlevel);



    }

}
