public class p18_SlidingWindow {
    // Ismein hum ek window define karte hain jo ek specific size ka hota hai aur us
    // window ka max number dhundhte hai
    public static void slide(int arr[], int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr = curr + arr[i];
        }
        int max = curr;
        for (int i = k; i < arr.length; i++) {
            curr += arr[i] - arr[i - k];
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 1 };
        slide(arr, 2);
    }
}
