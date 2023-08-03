package F2_Array; // Declares the package name

import java.util.Scanner; // Imports the Scanner class from java.util package

public class p2_search { // Defines a class named "p2_search"

    // Method to search for a given key in an integer array
    public static int search(int[] arr, int key) {
        // Worst Time complexity O(n)

        // Loop through the array "arr" to find the index of the "key"
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i; // Return the index if the "key" is found in the array
        }
        return -1; // Return -1 if the "key" is not found in the array
    }

    public static void main(String arg[]) {
        int arr[] = { 12, 34, 56, 75, 86 }; // Declares and initializes an integer array "arr" with elements 12, 34, 56,
                                            // 75, and 86
        System.out.println("Enter the key that you want to find:"); // Print a message to prompt the user to enter the
                                                                    // key to search for
        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input
        int key = sc.nextInt(); // Reads the user input and stores it in the variable "key"

        // Call the search method to find the index of the "key" in the array "arr"
        int result = search(arr, key);

        // Check if the result is -1, which indicates that the "key" was not found in
        // the array
        if (result == -1) {
            System.out.println("Key not found"); // Print a message indicating that the "key" was not found
        } else {
            System.out.println("We found the value " + arr[result] + " at position " + result); // Print a message
                                                                                                // indicating that the
                                                                                                // "key" was found at
                                                                                                // the given index
        }
    }
}
