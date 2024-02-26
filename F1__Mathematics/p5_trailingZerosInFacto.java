package F1__Mathematics;

import java.util.Scanner;

public class p5_trailingZerosInFacto {
    public static long facto(int a) {
        long res = 1;

        for (int i = 1; i <= a; i++) {
            res = res * i;
        }
        return res;
    }

    public static int counto(long c) {
        long res = c;
        int res2 = 0;
        while (res != 0) {
            long digit = res % 10;
            if (digit == 0) {
                res2++;
            }
            res = res / 10;
        }
        return res2;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long f = facto(a);
        System.out.println(f);
        System.out.print(counto(f));

        sc.close();
    }
}
