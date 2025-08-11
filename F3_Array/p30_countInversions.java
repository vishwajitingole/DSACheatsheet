package F3_Array;

// Inversion: A pair (i, j) such that i < j and arr[i] > arr[j]

public class p30_countInversions {

    /**
     * Counts the number of inversions in the array using a brute-force approach.
     * An inversion is a pair where the first index is less than the second,
     * but the value at the first index is greater than the value at the second.
     *
     * @param arr the input array
     * @return the total number of inversions
     */
    public static int countInversions(int arr[]) {
        int count = 0;
        // Iterate through each element
        for (int i = 0; i < arr.length; i++) {
            // For each element, check all subsequent elements
            for (int j = i + 1; j < arr.length; j++) {
                // If an inversion is found (arr[i] > arr[j]), increment the count
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {2, 4, 1, 3, 5};

        // Count and print the number of inversions in the array
        int inversions = countInversions(arr);
        System.out.println("Number of inversions: " + inversions); // Output should be 3
    }
}
