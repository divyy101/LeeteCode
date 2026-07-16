class Solution {
    static void allPaths(int[][] gr, LinkedHashSet<Integer> vi, int s, int d, List<List<Integer>> ans) {
        vi.add(s);

        if (s == d) {
            ans.add(new ArrayList<>(vi));
            vi.remove(s);
            return;
        }

        for (int i : gr[s]) {
            allPaths(gr, vi, i, d, ans);
        }

        vi.remove(s);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedHashSet<Integer> vi = new LinkedHashSet<>();

        allPaths(graph, vi, 0, graph.length - 1, ans);

        return ans;
    }
}