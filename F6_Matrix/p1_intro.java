package F6_Matrix;

import java.util.*;

public class p1_intro {

    public static void search(int m[][],int key) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == key) {
                    System.out.println("Key Found at cell " + "(" + i + " " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Key not Found!!! ");
        
    }

    public static void main(String arg[]) {
        int matrix[][] = new int[3][3];
        //3 rows and 3cols
        Scanner sc = new Scanner(System.in);
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        search(matrix, 3);
    }
    
}
