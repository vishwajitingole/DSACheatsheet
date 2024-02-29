package F3_Array;

public class p8_revArray {

    // Method to reverse the elements of the array
    public static void rev(int[] arr) {
        int n = arr.length - 1; // Get the last index of the array
        int low = 0; // Initialize a variable to point to the first element
        int high = n; // Initialize a variable to point to the last element

        // Swap elements from the outer ends towards the center of the array
        while (low < high) {
            int temp = arr[low]; // Store the element at the first index in a temporary variable
            arr[low] = arr[high]; // Copy the element from the last index to the first index
            arr[high] = temp; // Copy the element from the temporary variable to the last index
            low++; // Move the low pointer to the right (towards the center)
            high--; // Move the high pointer to the left (towards the center)
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        // Display the original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");

        // Call the rev method to reverse the array
        rev(arr);

        // Display the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
