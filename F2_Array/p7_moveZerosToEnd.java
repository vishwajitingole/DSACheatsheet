package F2_Array;

public class p7_moveZerosToEnd {
    // This method moves all the non-zero elements to the beginning of the array and
    // fills the rest of the array with zeros
    public static void chalpeeche(int[] arr) {
        int count = 0; // Initialize a variable 'count' to keep track of the non-zero elements

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If the current element is non-zero, move it to the front of the array at the
                // 'count' index
                // Increment 'count' to prepare for the next non-zero element
                arr[count++] = arr[i];
            }
        }

        // After the first loop, all non-zero elements are moved to the beginning of the
        // array
        // Now, we need to fill the remaining positions in the array with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 0, 234, 0, 0, 3, 56, 2, 0, 0, 96, 0, 7, 7, 9, 0 };
        chalpeeche(arr); // Call the method 'chalpeeche' to move zeros to the end of the array

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]); // Print each element of the array separated by a tab
        }
    }
}
