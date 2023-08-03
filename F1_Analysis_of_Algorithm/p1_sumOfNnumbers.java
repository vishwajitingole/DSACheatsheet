package F1_Analysis_of_Algorithm;

import java.util.*;

public class p1_sumOfNnumbers {

    // Time Complexity O(1)
    public static int fun(int n) {
        return n * (n + 1) / 2;
    }

    // Time Complexity O(n)
    public static void fun2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("Sum of the N natural numbers is:" + sum);
    }

    public static void main(String arg[]) {
        System.out.println("Program to print  Sum of Natural numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = fun(n);
        // System.out.println("Sum of the N natural numbers is:" + a);
        fun2(n);
    }

}