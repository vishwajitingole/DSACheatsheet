package F3_Array; // Declares the package name

import java.util.*; // Imports all classes from the java.util package

public class p4_delete { // Defines a class named "p4_delete"

    // Method to delete the element "del" from the array "brr" of capacity "cap"
    public static void delete(int[] brr, int cap, int del) {
        int i;
        // Search for the position of the element "del" in the array "brr"
        for (i = 0; i <= cap; i++) {
            if (brr[i] == del) {
                break; // If "del" is found, exit the loop with the index "i" holding the position
            }
        }

        System.out.print("Element found at position:" + i + "\n");

        // Shift the elements to the left to delete the element at the position "i"
        for (int j = i; j < cap; j++) {
            brr[j] = brr[j + 1];
        }

        // Print the modified array after deletion
        for (int k = 0; k < cap - 1; k++) {
            System.out.println(brr[k]);
        }
    }

    public static void main(String arg[]) {
        int arr[] = new int[10]; // Declares and initializes an integer array "arr" with a size of 10

        System.out.println("Enter the Elements for the array:"); // Prompt the user to enter elements for the array

        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input
        int cap = 0; // Variable to track the current number of elements in the array "arr"

        // Read 5 elements from the user input and store them in the array "arr"
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt(); // Reads an integer from the user input and stores it in the array "arr" at
                                   // index "i"
            cap++; // Increments the "cap" to track the number of elements in the array
        }

        System.out.println(""); // Moves to the next line
        // Print the elements of the array "arr"
        for (int i = 0; i < cap; i++) {
            System.out.print(arr[i] + "\t"); // Prints each element followed by a tab
        }

        System.out.println(""); // Moves to the next line
        System.out.println("Enter the Element that you want to delete:"); // Prompt the user to enter the element to
                                                                          // delete
        int del = sc.nextInt(); // Reads the user input and stores it in the variable "del"

        // Call the delete method to delete the element "del" from the array "arr"
        delete(arr, cap, del);
    }
}
