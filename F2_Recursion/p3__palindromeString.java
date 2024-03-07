package F2_Recursion;

public class p3__palindromeString {
    public static boolean isPalin(int s, int e, String a) {
        // Base case: if the start index crosses or equals the end index, it's a palindrome
        if (s >= e) {
            return true;
        }

        // Check if characters at current indices are equal
        if (a.charAt(s) == a.charAt(e)) {
            // Recur with updated indices
            return isPalin(s + 1, e - 1, a);
        }
        
        // If characters are not equal, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String a = "weew";
        int start = 0;
        int end = a.length() - 1;

        // Check if the string is a palindrome
        boolean result = isPalin(start, end, a);

        // Print the result
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
