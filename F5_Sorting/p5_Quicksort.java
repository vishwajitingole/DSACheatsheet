package F5_Sorting;
//TIme Complexity O(nsquare)

//It is consider faster due to few reasons
// inplace
// cache friendly
// Average case O(nlogn)
// tail recursive

//Naive is stable

//lomuto and Hoare's partition isn't stable


public class p5_Quicksort {

    // Function to perform Lomuto partition
    static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        // Iterate through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to perform Hoare's partition
    static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        // Iterate until the pointers meet
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers have not met, swap elements
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                return j;
            }
        }
    }

    // Function to perform Quicksort using Lomuto partition
    static void quicksortLomuto(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = lomutoPartition(arr, low, high);

            // Recursive calls for the two partitions
            quicksortLomuto(arr, low, pivotIndex - 1);
            quicksortLomuto(arr, pivotIndex + 1, high);
        }
    }

    // Function to perform Quicksort using Hoare's partition
    static void quicksortHoare(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = hoarePartition(arr, low, high);

            // Recursive calls for the two partitions
            quicksortHoare(arr, low, pivotIndex);
            quicksortHoare(arr, pivotIndex + 1, high);
        }
    }

    // Driver method to test the implementation
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original Array: ");
        printArray(arr);

        // Uncomment either of the following lines based on the partition scheme you want to use
        quicksortLomuto(arr, 0, n - 1);
        // quicksortHoare(arr, 0, n - 1);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    // Utility method to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
