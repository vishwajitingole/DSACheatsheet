package F2_Recursion;

public class p9_TillingProblem {
    public static void main(String[] args) {
        //We are going to find out total number of ways how we can
        // place our tile on a floor where the floor size 2*n
        //n is variable 

        //The tile that we are going to place on floor is size of 2*1
        System.out.println(ways(4));
       
        //The tile that we are going to place on the floor is size of 4*1
        System.out.println(ways41(5));

    }

    public static int ways(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }

        //kaam

        //vertical choices
        int fnm1 = ways(n - 1);

        //horizontal choices
        int fnm2 = ways(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static int ways41(int n) {
         //base case
        if (n == 0 || n == 1 || n == 2 || n == 3) {
        return 1;
    }
        
         //kaam
         //vertically
         int v = ways41(n - 1);

         //horizontally
         int h = ways41(n - 4);

         int totalWays = v + h;
         return totalWays;
    }
}
