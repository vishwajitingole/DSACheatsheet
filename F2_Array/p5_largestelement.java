package F2_Array;

import java.util.*;

public class p5_largestelement {
    public static int getlargest(int brr[]) {
        int l = 0;// Initialize l with the first element of the array
        int res = 0;
        for (int i = 1; i < brr.length; i++) {
            if (brr[i] > l) {
                l = brr[i];
            }
        }
        return l;
    }

    public static void main(String arg[]) {

        int arr[] = { 1, 45, 3, 4 };
        int large = getlargest(arr);
        System.out.println("Largest number is: " + large);

    }
}
