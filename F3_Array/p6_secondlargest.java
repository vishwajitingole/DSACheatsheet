package F3_Array;

// A separate class 'Larger' to find the second largest element in an array
class Larger {
    // This method returns the second largest element from the input array
    public int secondLargest(int[] arr) {
        int l = arr[0]; // Initialize 'l' with the first element of the array
        int res = 0; // Initialize 'res' to 0; it will store the second largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                res = l; // Update 'res' with the current 'l', which will be the second largest so far
                l = arr[i]; // Update 'l' with the current element if it is larger than 'l'
            }
        }
        return res; // Return the second largest element after iterating through the entire array
    }
}

public class p6_secondlargest {
    public static void main(String arg[]) {
        Larger l = new Larger(); // Create an instance of the 'Larger' class
        int arr[] = { 12, 32, 443, 545, 234 }; // Create an integer array 'arr' with the given elements
        int s = l.secondLargest(arr); // Call the 'secondLargest' method to find the second largest element in 'arr'
        System.out.println("Second Largest Number is:" + s); // Print the result (second largest element) to the console
    }
}
