package F3_Recursion;

import java.util.*;

public class p5_towerOfHanoi {
    public static void TOH(int l, char a, char b, char c) {
        if (l == 0)
            return;

        if (l == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }

        TOH(l - 1, a, c, b);
        System.out.println("Move " + l + " from " + a + " to " + c);
        TOH(l - 1, b, a, c);
    }

    public static void main(String arg[]) {
        int l = 200; // You can set the number of disks here
        char A = 'A', B = 'B', C = 'C'; // Assign values to A, B, and C representing the three towers
        TOH(l, A, B, C);
    }
}
