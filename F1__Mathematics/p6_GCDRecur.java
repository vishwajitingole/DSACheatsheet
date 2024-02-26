package F1__Mathematics;

import java.util.Scanner;

public class p6_GCDRecur {
    public static int GCD(int a,int b) {
        if (b == 0) {
            return a;
            //As our result which we were looking for will on the a side
        }
        return GCD(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
         int res = GCD(a, b);
        System.out.println(res);
    }
}
