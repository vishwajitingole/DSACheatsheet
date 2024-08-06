public class p15_LeadersInArray {
    // Note uske Right wale sabhi chote hone chahiye uske right mein usse bada aur
    // koi naa ho
    public static void leaders(int arr[]) {
        int n = arr.length;
        int l = arr[n - 1];
        System.out.print(l + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > l) {
                l = arr[i];
                System.out.print(l + " ");
            }
        }

    }

    public static void main(String arg[]) {
        int arr[] = { 7, 10, 2, 4, 5, 3, 0 };
        leaders(arr);
    }
}