package F3_Array;

public class p10_pairsInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        pairs(arr);
    }

    public static void pairs(int a[]) {
        int total = 0;
        // O(n^2)
        // for (int i = 0; i < a.length; i++) {
        // int curr = a[i];
        // for (int j = i + 1; j < a.length; j++) {
        // System.out.print("(" + curr + "," + a[j] + ")");
        // total++;
        // }
        // }

        int n = a.length;
        // O(1)
        total = n * (n - 1) / 2;
        System.out.println(total);
        // Similar to First Problem where we Sum of n natural numbers from 1 to n
        // In O(n) Time Complexity
        // total = n * (n + 1) / 2;
    }
}
