package F2_Array; // Declares the package name

import java.util.*; // Imports all classes from the java.util package

public class p3_insert { // Defines a class named "p3_insert"

    // Method to insert an element "a" at the given position "pos" in the array
    // "brr"
    // The array "brr" has a capacity of "cap"
    public static void insert(int[] brr, int a, int pos, int cap) {
        int index = pos - 1; // Calculates the index at which the element "a" should be inserted
        // Shifts the elements to the right from the end to the insertion position
        for (int i = cap - 1; i >= index; i--) {
            brr[i + 1] = brr[i];
        }
        brr[index] = a; // Inserts the element "a" at the specified position
    }

    public static void main(String arg[]) {

        // We declare the size as 10
        int arr[] = new int[10]; // Declares and initializes an integer array "arr" with a size of 10
        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in); // Creates a new Scanner object to read user input

        int cap = 0; // Variable to track the current number of elements in the array "arr"

        // We enter only 5 elements so we will have some space remaining to insert an
        // element
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt(); // Reads an integer from the user input and stores it in "a"
            arr[i] = a; // Inserts the element "a" into the array "arr" at index "i"
            cap++; // Increments the "cap" to track the number of elements in the array
        }

        // Printing the elements of the array "arr"
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + "\t"); // Prints each element followed by a tab
        }

        System.out.println(""); // Moves to the next line

        System.out.println("Enter the number which you want to input in the Array"); // Prompt the user to enter a
                                                                                     // number
        int a = sc.nextInt(); // Reads the user input and stores it in the variable "a"

        System.out.println("Enter the position where you want to input " + a); // Prompt the user to enter the position
                                                                               // to insert the number
        int pos = sc.nextInt(); // Reads the user input and stores it in the variable "pos"

        // Call the insert method to insert the element "a" at position "pos" in the
        // array "arr"
        insert(arr, a, pos, cap);

        // Printing the modified array "arr" after insertion
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t"); // Prints each element followed by a tab
        }
    }
}
