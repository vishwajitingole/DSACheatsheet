package F6_Matrix;

import java.util.Arrays;

public class p8_setZeros {
    public static void setzero(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] zeroRow=new boolean[m];
        boolean[] zeroCol=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroRow[i]=true;
                    zeroCol[j]=true;
                }
            }
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(zeroRow[i]|| zeroCol[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Agar kahi zero mila toh uske entire row aur col donno mein zero kar do 
        int[][] mat={{1,1,1},{1,0,1},{1,1,1}};
        setzero(mat);
        
        // [[1,0,1],[0,0,0],[1,0,1]]

         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        
    }
}
