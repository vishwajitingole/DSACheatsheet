package F3_Array;

public class p14_MajorityElement {
    public static void main(String[] args) {
        //Majority elements means that the number appears more than n/2 times
        //Where n is size of that array
        //Boyer-Moore Voting Algorithm
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
       System.out.print(majo(arr));
    }

    public static int majo(int a[]) {
        int candidate = 0;
        int count = 0;
        for (int num : a) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
}
