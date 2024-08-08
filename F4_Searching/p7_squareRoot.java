package F4_Searching;

public class p7_squareRoot {
    public static int sroot(int x) {
        int low = 0;
        int high = x;
        int res = 0;
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == mid * mid) {
                return mid;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(sroot(25));
    }
}
