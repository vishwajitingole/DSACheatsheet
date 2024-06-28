package F6_Matrix;

public class p3_diagonalSum {

    
    public static void diagonalSum(int m[][]) {
        int sum = 0;
        //O(n^2)
        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[0].length; j++) {
        //primary diagonal wo diagonal hai jisse hum left se right corner mein jaayenge
        //         if (i == j) {
        //             sum += m[i][j];
        //         }
        //secondary diagonal wo diagonal hai jisse hum right se left corner mein jaayenge
        //         else if (i + j == m.length-1) {
        //              sum += m[i][j];
        //         }
        //     }
        // }
        

        for (int i = 0; i < m.length; i++) {
            //primary diagonal
            sum += m[i][i];
            if (i != m.length - i - 1) {
                sum += m[i][m.length - i - 1];
            }
        }
        System.out.println("Both Diagonal :- " + sum);

    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diagonalSum(m);
        //only for a square matrix
    }
}
