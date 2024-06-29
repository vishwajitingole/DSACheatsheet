
public class p2_SubsetInString {
    public static void findSubsets(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //recursion
        findSubsets(str, ans, i+1);
        findSubsets(str, ans + str.charAt(i), i + 1);
        
        
    }
    public static void main(String[] args) {
        //Total number of subsets = 2^n 
        String str = "abc";
        String ans = "";
        findSubsets(str, ans, 0);
    }
}
