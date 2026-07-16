import java.util.*;

class Solution {

    public void dfs(int[][] M, HashSet<Integer> vis, int i) {
        vis.add(i);

        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && !vis.contains(j)) {
                dfs(M, vis, j);
            }
        }
    }

    public int findCircleNum(int[][] M) {
        HashSet<Integer> vis = new HashSet<>();
        int count = 0;

        for (int i = 0; i < M.length; i++) {
            if (!vis.contains(i)) {
                dfs(M, vis, i);
                count++;
            }
        }

        return count;
    }
}