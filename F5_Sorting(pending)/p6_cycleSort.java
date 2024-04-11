package F5_Sorting;

//Worst case O(n^2) sorting algorithm

//Ye algorithm minimum memory writes karta hai aur jab memory writes costly hote hain toh ye useful hota hai
//Ye inplace sorting hai aur stable nahi hai

//Ye find jaise questions ko solve karne mein useful hota hai jaise ki kisi array ko swap karne ke liye minimum swaps find karna

public class p6_cycleSort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 1, 4, 3}; // Array to be sorted
        int n = arr.length;

        cycleSort(arr, n); // Calling cycleSort function to sort the array

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to perform cycle sort
    public static void cycleSort(int[] arr, int n) {
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            // Find position where we put the current element
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            // If the item is already in the correct position, skip
            if (pos == cycleStart) {
                continue;
            }

            // Ignore duplicates
            while (item == arr[pos]) {
                pos++;
            }

            // Put the item to its correct position
            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            // Rotate rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                // Ignore duplicates
                while (item == arr[pos]) {
                    pos++;
                }

                // Put the item to its correct position in the cycle
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }
}
