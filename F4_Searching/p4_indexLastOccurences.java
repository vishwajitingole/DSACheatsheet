package F4_Searching;

public class p4_indexLastOccurences {
    public static int lastOcc(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int mid = (low + high) / 2;
            if (low > high) {
                return -1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 2, 2, 3, 4, 4 };

        System.out.println(lastOcc(arr, 2));
    }
}
