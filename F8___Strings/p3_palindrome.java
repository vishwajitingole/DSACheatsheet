package F8___Strings;
public class p3_palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalin(str));
    }

    public static boolean isPalin(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
