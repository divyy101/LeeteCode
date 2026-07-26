class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;

        for (String str : s) {
            max = Math.max(max, str.split(" ").length);
        }

        return max;
    }
}