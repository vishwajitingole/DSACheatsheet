package F3_Array;
public class p19_isSubSum {
    // Iski madat se hum ye identify karenge ki kahi number k sum toh nhi hai kisi
    // array element kaa
    public static boolean isSubSum(int arr[], int k) {
        int s = 0;
        int curr = 0;
        for (int e = 0; e < arr.length; e++) {
            curr += arr[e];
            while (curr > k) {
                curr -= arr[s++];
            }
            if (curr == k) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        System.out.println(isSubSum(arr, 7));

    }
}
