package F5_Sorting;

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

   public static void merge(int arr[], int l, int m, int r) {
        // Calculate sizes of two halves
        int a = m - l + 1;
        int b = r - m;

        // Create temporary arrays
        int left[] = new int[a];
        int right[] = new int[b];

        // Copy data to temporary arrays
        for (int i = 0; i < a; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < b; j++) {
            right[j] = arr[m + 1 + j];
        }

        // Merge the temporary arrays

        int i = 0, j = 0, k = l;

        // Compare elements and merge
        while (i < a && j < b) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any
        while (i < a) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < b) {
            arr[k] = right[j];
            j++;
            k++;
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
