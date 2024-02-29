package F3_Array;

import java.util.*;

public class p5_largestelement {
    // This method returns the largest element from the input array
    public static int getlargest(int brr[]) {
        int l = 0; // Initialize the largest element variable with the first element of the array
        int res = 0; // This variable 'res' is not used in the code and can be removed.
        // But we would be using this variable in the next code
        for (int i = 1; i < brr.length; i++) {
            if (brr[i] > l) {
                l = brr[i]; // Update 'l' with the current element if it is larger than 'l'
            }
        }
        return l; // Return the largest element after iterating through the entire array
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 45, 3, 4 }; // Create an integer array 'arr' with elements 1, 45, 3, and 4
        int large = getlargest(arr); // Call the 'getlargest' method to find the largest element in 'arr'
        System.out.println("Largest number is: " + large); // Print the result (largest element) to the console
    }
}
