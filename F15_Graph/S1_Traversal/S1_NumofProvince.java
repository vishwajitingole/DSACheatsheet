package S1_Traversal;

public class S1_NumofProvince {
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            boolean[] visited = new boolean[n];
            int countPro = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    countPro++;
                    dfs(isConnected, visited, i);
                }
            }
            return countPro;
        }

        private void dfs(int[][] isConnected, boolean[] visited, int i) {
            visited[i] = true;
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1 && !visited[j]) {
                    dfs(isConnected, visited, j);
                }
            }
        }
    }
}
