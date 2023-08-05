package F3_Recursion;

import java.util.*;

//Tail recursion are more  faster
//the function call where the function call takes place at the end of the function
public class p3_print1ton {
    public static void print(int a) {
        if (a == 0)
            return;
        print(a - 1);
        System.out.println(a);
    }

    public static void main(String arg[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
