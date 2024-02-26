package F1__Mathematics;

import java.util.Scanner;

public class p4_factorecur {
    
    // Recursive function to calculate factorial of a number
    public static int facto(int a) {
        // Base case: If the number is 0, return 1
        if (a == 0)
            return 1;
        
        // Recursive case: Multiply the number with the factorial of (number - 1)
        return a * facto(a - 1);
    }
    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // User se input le lo
        int result = facto(a);  // Factorial calculate karne wale recursive function ko call karo
        System.out.println("Factorial of " + a + " is: " + result);  // Factorial ko print karo

    }
}
