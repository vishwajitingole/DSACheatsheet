package F1__Mathematics;

import java.util.Scanner;

// Largest number which divides given two numbers
//Powered by Euclidean Algorithm
public class p6_GCD {
    
    // Function to calculate Greatest Common Divisor (GCD) using Euclidean Algorithm
    public static void GCD(int a, int b) {
        
        // Jab tak dono numbers barabar nahi ho jaate, continue karo
        while (a != b) {
            // Agar a bada hai, toh a se b subtract karo
            if (a > b) {
                a = a - b;
            } else {
                // Agar b bada hai, toh b se a subtract karo
                b = b - a;
            }
        }
        
        // Jab loop khatam ho jaaye, toh a jo bacha hai woh hoga GCD
        System.out.println("Greatest Common Divisor is " + a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Pehla number input lo
        int b = sc.nextInt();  // Dusra number input lo
        
        GCD(a, b);  // GCD calculate karne wale function ko call karo
    }
}
