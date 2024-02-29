package F2_Recursion;

import java.util.*;

//Tail recursion are more  faster
//the function call where the function call takes place at the end of the function

//Program given below is a tail recursion function
public class p2_printnto1 {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        print(n);
    }
}
