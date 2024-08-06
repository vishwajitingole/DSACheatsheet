public class p17_maxconsecof1s {
    public static int max(int arr[]) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                max = Math.max(max, curr);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 1, 1, 0, 1, 1 };

        System.out.println(max(arr));
    }
}
