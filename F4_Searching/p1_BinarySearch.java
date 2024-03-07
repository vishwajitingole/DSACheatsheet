package F4_Searching;
import java.util.*;

public class p1_BinarySearch {
    public static int bSearch(int arr[],int n,int key) {
        int low=0;
        int high=n-1;
   
        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        int n = arr.length-1;
        System.out.println("Enter the number to be found");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println("This is the key we need to find   \t" + key );
        int a = bSearch(arr, n, key);
        if (a==-1) {
            System.out.println("Not found");
        } else {
            System.out.println("found at \t"+a);
        }


        

    }
}
