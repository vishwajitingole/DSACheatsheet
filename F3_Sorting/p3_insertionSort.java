package F3_Sorting;

//Time Complexity :- O(n)
//Used when the array size is less

//Ultimate Version:-TimSort and IntroSort

//Here we divide the array in two parts Sorted & Unsorted

public class p3_insertionSort {
    public static void isort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String arg[]) {
        int arr[] = { 100, 10, 2, 65, 23, 54, 2000 };

        isort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
