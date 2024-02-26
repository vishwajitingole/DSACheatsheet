package F1__Mathematics;

public class p1_countDigits {
    
    // Function to count the number of digits in a given integer
    public static int count(int a) {
        int res = 0; // Result ko 0 se shuru karo
        
        // Jab tak a 0 nahi ho jata, continue karo
        while (a != 0) {
            a = a / 10; // Aakhri digit ko hata do
            res++;     // Digits ki ginti badhao
        }
        
        return res; // Digits ki ginti wapas karo
    }
    
    public static void main(String args[]) {
        int a = 1; // Udaharan ke liye input
        int res = count(a); // Count function ko call karo
        System.out.print(res); // Result ko print karo
    }
}
