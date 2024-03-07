package F5_Sorting;

import java.util.*;

public class p4__MergeTwoSortedArray {
    public static void merge(int a[], int b[]) {
        int i = 0, j = 0;
        int m = a.length;
        int n = b.length;

        // This loop will compare all the possible comparision in between those
        // two array

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            } else {
                System.out.print(b[j++] + " ");
            }

        }
        //jab comparision karke hojaye aur sorted array mil jaaye fir
        // jo bacche kuch jo element hai jo print nhi huye wo print honge
        while (i < m) {
            System.out.print(a[i++] + " ");
        }
        while (j < n) {
            System.out.print(b[j++] + " ");
        }
    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 5, 7, 8, 9, 12 };
        int b[] = { 3, 4, 6, 10, 11 };

        merge(a, b);

    }
}
