package F3_Array;

public class p11_KadaneMaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = { 3,1,-10, 2,6, -3, 5, -1 };
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > ms) {
                ms = cs;
            }
        }
        System.out.print(ms);
    }
}
