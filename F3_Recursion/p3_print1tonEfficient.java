package F3_Recursion;

import java.util.*;

//Here the function is being called at the end of the call as a result it becomes a faster 
//Also we could call it as tail recursive function

public class p3_print1tonEfficient {
    public static void print(int a, int k) {
        if (a == 0)
            return;
        System.out.println(k);
        print(a - 1, k + 1);
    }

    public static void main(String arg[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = 1;
        print(a, k);
    }
}
