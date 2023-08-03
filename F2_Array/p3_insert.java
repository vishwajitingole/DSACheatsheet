package F2_Array;

import java.util.*;

public class p3_insert {

    public static void insert(int[] brr, int a, int pos, int cap) {
        int index = pos - 1;
        for (int i = cap - 1; i >= index; i--) {
            brr[i + 1] = brr[i];
        }
        brr[index] = a;

    }

    public static void main(String arg[]) {

        // We declare the size as 10
        int arr[] = new int[10];
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);

        // We enter only 5 elements so we will have some space remaining to insert an
        // element
        int cap = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            cap++;
        }
        // printing the elements which has been stored by default these elements are
        // zero that's why we may see zero in it
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("");
        System.out.println("Enter the number which you want to input in the Array");

        int a = sc.nextInt();

        System.out.println("Enter the position where you want to input " + a);
        int pos = sc.nextInt();
        insert(arr, a, pos, cap);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
