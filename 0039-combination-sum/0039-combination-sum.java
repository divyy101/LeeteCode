class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(c, t, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int[] c, int t, int i, List<Integer> temp, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i == c.length || t < 0) return;

        temp.add(c[i]);
        solve(c, t - c[i], i, temp, ans); // reuse
        temp.remove(temp.size() - 1);

        solve(c, t, i + 1, temp, ans);    // skip
    }
}