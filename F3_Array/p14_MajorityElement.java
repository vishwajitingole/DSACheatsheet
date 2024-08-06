package F3_Array;

public class p14_MajorityElement {
    public static void main(String[] args) {
        // Majority elements means that the number appears more than n/2 times
        // Where n is size of that array
        // Boyer-Moore Voting Algorithm
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.print(majo(arr));
    }

    public static int majo(int a[]) {
        int candidate = 0;
        int count = 0;
        int max = -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
                max = Math.max(max, count);
                if (max < count) {
                    candidate = a[i];
                }
            } else if (count < 0) {
                count = 1;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
