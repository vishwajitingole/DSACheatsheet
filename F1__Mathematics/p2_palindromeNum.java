package F1__Mathematics;

import java.util.Scanner;

public class p2_palindromeNum {

    // Function to check if a number is a palindrome
    public static boolean palin(int a) {
        int res = 0;       // Result ko 0 se shuru karo
        int temp = a;      // Temporary variable mein input number ko store karo
        
        // Jab tak temp 0 nahi ho jata, continue karo
        while (temp != 0) {
            int l = temp % 10;      // Aakhri digit nikalo
            res = res * 10 + l;     // Result ko 10 guna karke aakhri digit add karo
            temp = temp / 10;       // Aakhri digit ko hata do
        }
        
        return (a == res);  // Original number aur reverse number ka comparison karo, agar same hain toh true, nahi toh false
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // User se input le lo
        boolean res = palin(a); // Palindrome check function ko call karo
        if (res == true) {
            System.out.println("It is Palin");    // Palindrome hai toh print karo
        } else {
            System.out.println("It is not Palin"); // Palindrome nahi hai toh print karo
        }
        sc.close();  // Scanner ko close karo
    }
}
