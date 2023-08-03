package F2_Array; // Declares the package name

import java.util.ArrayList; // Imports the ArrayList class from java.util package

public class p1_array { // Defines a class named "p1_array"
    public static void main(String arg[]) { // Main method, the entry point of the program
        int arr[] = { 1, 2, 3, 4, 5 }; // Declares and initializes an integer array "arr" with elements 1, 2, 3, 4, 5

        // Loop through the array "arr" and print each element followed by a tab
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

            int arr2[] = new int[100]; // Declares a new integer array "arr2" with a size of 100

            // Dynamic array declaration using ArrayList
            // ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
            // With an ArrayList, you can add or remove elements at runtime using methods
            // like add() and remove(),
            // making it a true dynamic array.
        }
    }
}
