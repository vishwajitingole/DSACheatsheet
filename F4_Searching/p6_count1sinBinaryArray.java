package F4_Searching;

public class p6_count1sinBinaryArray {
    public static int count(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return (arr.length - mid);
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1 };

        System.out.println(count(arr, 1));
    }
}
