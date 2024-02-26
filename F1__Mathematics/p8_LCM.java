package F1__Mathematics;

import java.util.Scanner;

//Fact Multiplication of two number is= GCD * LCM


public class p8_LCM {
        public static int GCD(int a,int b){
            if (b == 0) {
                return a;
            }
            GCD(b,a%b);
        }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int gcd= GCD(a, b);

    }
}
