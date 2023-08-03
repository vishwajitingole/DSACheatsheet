package F2_Array;

import java.util.*;

public class p5_largestelement {
    public static int getlargest(int brr[]) {
        int l = 0;
        int res = 0;
        for (int i = 1; i < brr.length; i++) {
            if (brr[i] > brr[l]) {
                res = brr[i];
            }
        }
        return res;
    }

    public static void main(String arg[]) {

        int arr[] = { 1, 2, 3, 4 };
        int large = getlargest(arr);
        System.out.println("Largest number is: " + large);

    }
}
