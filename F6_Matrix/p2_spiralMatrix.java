package F6_Matrix;

public class p2_spiralMatrix {
    public static void main(String arg[]) {
        //The elements will be iterated in a spiral format
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }

    public static void printSpiral(int m[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = m.length - 1;
    int endCol = m[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
        // Top will be printed
        for (int i = startCol; i <= endCol; i++) {
            System.out.print(m[startRow][i] + " ");
        }
        startRow++;

        // Right will be printed
        for (int i = startRow; i <= endRow; i++) {
            System.out.print(m[i][endCol] + " ");
        }
        endCol--;

        // Bottom will be printed
        if (startRow <= endRow) {
            for (int i = endCol; i >= startCol; i--) {
                System.out.print(m[endRow][i] + " ");
            }
            endRow--;
        }

        // Left will be printed
        if (startCol <= endCol) {
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(m[i][startCol] + " ");
            }
            startCol++;
        }
    }
}

    
}
