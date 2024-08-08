package F4_Searching;

public class p2_recBS {

    // Iterative approach is preferred because the recBS will cost O(logn) extra
    // space
    public static int recBS(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return recBS(arr, low, mid - 1, target);
        } else {
            return recBS(arr, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 10 };
        int low = 0;
        int high = arr.length - 1;

        System.out.println(recBS(arr, low, high, 5));

    }
}
