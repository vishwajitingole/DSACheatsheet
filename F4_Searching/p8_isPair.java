package F4_Searching;

public class p8_isPair {
    public static boolean isPair(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] + arr[high] == target) {
                return true;
            } else if (arr[low] + arr[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.print(isPair(arr, 7));
    }
}
