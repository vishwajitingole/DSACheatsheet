package F5_Sorting;

import java.util.*;
import java.lang.*;

public class p1_bubblesort {

    // Time Complexity
    // O(n^2)
    // Stable sorting :-Yes
    

    // Bubble Sort ka implementation
    public static void bs(int arr[]) {
        int n = arr.length;
        
        // Outer loop: Iterate through the entire array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: Compare and swap adjacent elements
            for (int j = 1; j < n - i - 1; j++) {
                if (arr[j-1] > arr[j]) {
                    // Swap if the current element is greater than the next one
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void main(String arg[]) {

        // Input array for sorting
        int arr[] = { 10, 34, 53, 75, 96, 4, 2, 55, 45 };

        // Calling the Bubble Sort function
        bs(arr);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
