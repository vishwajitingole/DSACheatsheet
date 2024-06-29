package F8___Strings;

public class p5_Anagram {
    public static void main(String[] args) {
        //This algo confirms whether same number of alphabets 
        //are present in two strings although the order could be different
        String t = "Moon";
        String b = "oMon";
        System.out.println(isAna(t, b));
    }

    public static boolean isAna(String t, String b) {
        int Arr[] = new int[256];
        for (int i = 0; i < t.length(); i++) {
            Arr[t.charAt(i)]++;
        }
        for (int i = 0; i < b.length(); i++) {
            Arr[b.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (Arr[i] != 0) {
                return false;
            }

        }
        return true;
    } 
}
