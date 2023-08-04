package F2_Array;

public class p7_moveZerosToEnd {
    public static void movezero(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];

            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 0, 234, 0, 0, 3, 56, 2, 0, 0, 96, 0, 07, 7, 9, 0 };
        movezero(arr);

    }
}
