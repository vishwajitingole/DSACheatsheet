package F3_Array;
/**
 * p16_stockBuyandSell
 */
public class p16_stockBuyandSell {
    // we assume that we have data about the data pricing
    // We need to buy sell the stock in such a way so that we will get maximum
    // profit

    // If prices are sorted in Decreasing order then the profit is
    // going to be 0

    public static void maxProfit(int arr[]) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + (arr[i] - arr[i - 1]);
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };
        maxProfit(arr);
    }
}