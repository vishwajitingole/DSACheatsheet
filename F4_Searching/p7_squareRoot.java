package F4_Searching;

public class p7_squareRoot {
        public static int sroot(int x) {
            if (x == 0 || x == 1) return x;
        
            int low = 1;
            int high = x / 2;
            int res = 0;
        
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long sq = (long) mid * mid;
        
                if (sq == x) {
                    return mid;
                } else if (sq > x) {
                    high = mid - 1;
                } else {
                    res = mid;
                    low = mid + 1;
                }
            }
            return res;
        }

    public static void main(String[] args) {

        System.out.println(sroot(25));
    }
}
