package F3_Sorting;

//Time Complexity :- O(n)
//Does less memory writes in compared to other alogorithms
//Cycle sort is Optimal Algorithm
//Not stable

import java.util.*;

public class p2_SelectionSort {
    public static void ss(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i; // Corrected: Initialize min with i
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) { // Corrected: Compare arr[j] with arr[min]
                    min = j;
                }
            }

            swap(arr, i, min);
            // Swap elements
            // int temp = arr[min];
            // arr[min] = arr[i];
            // arr[i] = temp;
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String arg[]) {
        int arr[] = { 12, 4, 21, 42, 1, 3, 432, 28 };
        ss(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
