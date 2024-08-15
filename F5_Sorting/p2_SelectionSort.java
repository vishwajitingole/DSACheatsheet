package F5_Sorting;

import java.util.*;

//Selection Sort ka implementation
//Time Complexity: O(n^2)
//Memory Writes: Kam hoti hai compared to other algorithms
//Cycle Sort Optimal Algorithm mana jata hai
//Stability: Nahi hai (Not Stable) :- Order of equal elements may change

public class p2_SelectionSort {

    // Selection Sort Function
    public static void ss(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i; // Minimum element index ko initialize karte hai
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) { // Current minimum element ke saath compare karte hai
                    min = j;
                }
            }

            // Elements ko swap karte hai
            swap(arr, i, min);
        }
    }

    // Swap Function
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Main Function
    public static void main(String arg[]) {
        int arr[] = { 12, 4, 21, 42, 1, 3, 432, 28, 1 };

        // Selection Sort Function call
        ss(arr);

        // Sorted Array ko print karte hai
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
