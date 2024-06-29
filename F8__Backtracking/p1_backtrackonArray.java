package F8__Backtracking;
import java.util.*;
public class p1_backtrackonArray{
    public static void main(String arg[]) {
        System.out.println("Hello");
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void changeArr(int arr[],int idx,int val) {
        if (idx == arr.length - 1) {
            return;
        }
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1);
        arr[idx] -= 2;
    }
}