package F4_Searching;

import java.util.HashSet;

public class p9_repeatingElements {
    public static void repeating(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                repeated.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }

        for (int num : repeated) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 5 };
        repeating(arr);
    }
}
