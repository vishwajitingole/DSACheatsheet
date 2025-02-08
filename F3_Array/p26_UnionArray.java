package F3_Array;

import java.util.ArrayList;

public class p26_UnionArray {
    public static void union(int[] arr, int[] arr2) {
        int len1 = arr.length;
        int len2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> uni = new ArrayList<>();

        while (i < len1 && j < len2) {
            if (arr[i] == arr2[j]) {  // ✅ Same values, add once and move both pointers
                if (uni.isEmpty() || uni.get(uni.size() - 1) != arr[i]) {
                    uni.add(arr[i]);
                }
                i++;
                j++;  // ✅ Move both pointers to avoid duplicate comparisons
            } else if (arr[i] < arr2[j]) { 
                if (uni.isEmpty() || uni.get(uni.size() - 1) != arr[i]) {
                    uni.add(arr[i]);
                }
                i++;
            } else { 
                if (uni.isEmpty() || uni.get(uni.size() - 1) != arr2[j]) {
                    uni.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < len1) {  // ✅ Add remaining elements from arr
            if (uni.isEmpty() || uni.get(uni.size() - 1) != arr[i]) {
                uni.add(arr[i]);
            }
            i++;
        }

        while (j < len2) {  // ✅ Add remaining elements from arr2
            if (uni.isEmpty() || uni.get(uni.size() - 1) != arr2[j]) {
                uni.add(arr2[j]);
            }
            j++;
        }

        for (int li : uni) {
            System.out.print(" " + li);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 7, 8, 9};
        union(arr, arr2);
    }
}
