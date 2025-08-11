package F3_Array;

import java.util.ArrayList;
import java.util.List;

public class p22_pascalTriangle {

        private static List<Integer> generateRow(int row) {
            long ans = 1;
            List<Integer> ansRow = new ArrayList<>();
            // Inserting the 1st element
            ansRow.add(1);

            // Calculate the rest of the elements
            for (int col = 1; col < row; col++) {
                ans = ans * (row - col);
                ans = ans / col;
                ansRow.add((int) ans);
            }
            return ansRow;
        }

        public  static List<List<Integer>> pascalTriangle(int numRows) {
            List<List<Integer>> pascalTriangle = new ArrayList<>();

            // Store the entire Pascal's Triangle
            for (int row = 1; row <= numRows; row++) {
                pascalTriangle.add(generateRow(row));
            }

            // Return the Pascal's Triangle
            return pascalTriangle;
        }

    public static void main(String[] args) {

       System.out.println(pascalTriangle(5));
    }

}
