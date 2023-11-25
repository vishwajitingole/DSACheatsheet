package F3_Recursion;

import java.util.*;

public class p1_fact {

    public static int fact(int a) {
        if (a == 1)
            return 1;

        return a * fact(a - 1);

    }

    public static void main(String arg[]) {

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int f = fact(a);
        System.out.println(f);
        sc.close();
    }
}
