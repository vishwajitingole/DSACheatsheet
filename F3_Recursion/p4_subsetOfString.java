package F3_Recursion;

import java.util.*;

class p4_subsetOfString {

    // str : Stores input string
    // curr : Stores current subset
    // index : Index in current subset, curr
    static void print(String str, int index, String curr) {
        int n = str.length();

        // base case
        if (index == n) {
            System.out.println(index + curr);
            return;
        }

        print(str, index + 1, curr);
        print(str, index + 1, curr + str.charAt(index));

    }

    // Driver code
    public static void main(String[] args) {
        String str = "ab";
        int index = 0; // Start index from 0
        String curr = "";

        print(str, index, curr);
    }
}
