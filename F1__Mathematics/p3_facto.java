package F1__Mathematics;

import java.util.Scanner;

public class p3_facto {
    
    // Function to calculate factorial of a number
    public static void facto(int a) {
        int res = 1;  // Result ko 1 se shuru karo

        // Factorial calculate karne ke liye for loop use karo
        for (int i = 2; i <= a; i++) {
            res = res * i;  // Har iteration mein res ko i se multiply karo
        }
        
        System.out.print(res);  // Final factorial ko print karo
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // User se input le lo
        facto(a);  // Factorial calculate karne wale function ko call karo
    }
}
