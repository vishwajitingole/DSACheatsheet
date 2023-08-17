package F3_Sorting;

import java.util.*;
import java.lang.*;

public class p1_bubblesort {

    public static void bs(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String arg[]) {

        int arr[] = { 1, 34, 53, 75, 96, 4, 2, 55, 45 };
        bs(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
