package F2_Array;

class Larger {
    public int secondLargest(int[] arr) {
        int l = arr[0];// Initialize l with the first element of the array
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                res = l;
                l = arr[i];

            }
        }
        return res;
    }
}

public class p6_secondlargest {

    public static void main(String arg[]) {
        Larger l = new Larger();
        int arr[] = { 12, 32, 443, 545, 234 };
        int s = l.secondLargest(arr);
        System.out.println("Second Largest Number is:" + s);
    }
}
