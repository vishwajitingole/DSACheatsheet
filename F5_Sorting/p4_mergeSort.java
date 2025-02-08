package F5_Sorting;

import java.util.ArrayList;
import java.util.List;

//TIme Complexity :- O(n)
//Stable sorting of algorithm as it maintains the original order of the items/ elements

//Good for LinkedList works in O(1) Space Comlexity
//For Array Quicksort outperforms

//Works on Divide and conquer algorithm

public class p4_mergeSort {

    public static void mergeSort(int arr[], int l, int r) {

        if (l < r) {
            int m = (l + r) / 2; // Calculate the correct middle index
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }

    }

  public static void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>(); // Temporary sorted array
    int left = low;      // Left part ka starting index
    int right = mid + 1; // Right part ka starting index

    // ✅ Step 1: Compare & Merge two sorted parts
    while (left <= mid && right <= high) {
        if (arr[left] < arr[right]) {
            temp.add(arr[left]); // Left part ka element chhota hai, add karo
            left++;
        } else {
            temp.add(arr[right]); // Right part ka element chhota hai, add karo
            right++;
        }
    }

    // ✅ Step 2: Agar left part me kuch bacha ho toh add karo
    while (left <= mid) {
        temp.add(arr[left]);
        left++;
    }

    // ✅ Step 3: Agar right part me kuch bacha ho toh add karo
    while (right <= high) {
        temp.add(arr[right]);
        right++;
    }

    // ✅ Step 4: Sorted `temp` array wapas `arr` me copy karo
    for (int i = low; i <= high; i++) {
        arr[i] = temp.get(i - low); // `i - low` indexing adjust karta hai
    }
}

    public static void main(String arg[]) {
        int arr[] = { 1, 20, 3, 2, 8, 5, 19 };
        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l, r);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
