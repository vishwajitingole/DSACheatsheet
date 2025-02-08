package F6_Matrix;

public class p2_spiralMatrix {
    public static void main(String arg[]) {
        //The elements will be iterated in a spiral format
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {
        int top = 0;  // 🔹 First Row
        int left = 0;  // 🔹 First Column
        int bottom = matrix.length - 1;  // 🔹 Last Row
        int right = matrix[0].length - 1;  // 🔹 Last Column
    
        while (top <= bottom && left <= right) {
            // 🔹 Print Top Row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
    
            // 🔹 Print Right Column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
    
            // 🔹 Print Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
    
            // 🔹 Print Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    
    
}
