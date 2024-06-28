package F6_Matrix;

public class p4_searchInSortedMatrix {
    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3 }, { 1, 5, 6 }, { 80, 90, 100 } };
        int key = 90;
        search(m, key);
    }

    public static void search(int m[][], int key) {
        int row = 0, col = m[0].length - 1;
        while (row < m.length && col >= 0) {
            if (key == m[row][col]) {
                System.out.println("Key Found at " + row + " " + " " + col);
                return;
            }
            else if (key < m[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
    }
}
