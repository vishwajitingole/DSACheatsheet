package F3_Array;

public class p9_rotatebyone {
    // Method to rotate the array by one position to the left
    public static void rotateByOne(int[] arr) {
        int f = arr[0]; // Store the first element of the array in a temporary variable
        int n = arr.length; // Get the length of the array

        // Shift all elements to the left by one position
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = f; // Place the first element at the last position to complete the rotation
    }

    public static void main(String[] arg) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // Display the original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        rotateByOne(arr); // Call the rotateByOne method to rotate the array
        System.out.println("");

        // Display the array after rotation
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
