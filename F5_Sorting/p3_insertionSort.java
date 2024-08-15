package F5_Sorting;

//Insertion Sort ka implementation
//Time Complexity: O(n^2)
//Stable inplace sorting algorithm
//Array size kam hone par istemal hota hai
//Ultimate Version: TimSort and IntroSort
//Array ko do parts mein divide karte hai - Sorted aur Unsorted

public class p3_insertionSort {
    
    // Insertion Sort Function
    public static void isort(int arr[]) {
        int n = arr.length;

        // Traverse through the array
        for (int i = 1; i < n; i++) {
            int key = arr[i];

            // Compare key with each element on the left side of it
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position in the sorted part
            arr[j + 1] = key;
        }
    }

    // Main Function
    public static void main(String arg[]) {
        int arr[] = { 100, 10, 2, 65, 23, 54, 2000 };

        // Insertion Sort Function call
        isort(arr);

        // Sorted Array ko print karte hai
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
