package F6_Matrix;

public class p5_rotateby90 {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Ye replace karege sabhi non diagonal elements ko
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Ulta kardega harrr row ko taaki wo 90 deg rotation lage
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                // Reverse the columns
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;

            }
        }
    }

    public static void main(String arg[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
