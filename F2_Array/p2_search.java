package F2_Array;

import java.util.Scanner;

public class p2_search {

    public static int search(int[] arr, int key) {

        // Worst Time complexity O(n)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String arg[]) {
        int arr[] = { 12, 34, 56, 75, 86 };
        System.out.println("Enter the key that you want to find:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int result = search(arr, key);
        if (result == -1) {
            System.out.println("Key not find");
        } else {
            System.out.println("We find the value " + arr[result] + " key at position " + result);
        }
    }
}
