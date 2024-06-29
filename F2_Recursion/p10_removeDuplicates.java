package F2_Recursion;

public class p10_removeDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] arr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);

        if (arr[currChar]) {
            // Character already seen, skip
            removeDuplicates(str, idx + 1, newStr, arr);
        } else {
            // Mark character as seen
            arr[currChar] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, arr);
        }
    }

    public static void main(String[] args) {
        String str = "Vishwajit Ingole";
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[256]; // ASCII size to handle all characters
        removeDuplicates(str, 0, sb, arr);
    }
}
