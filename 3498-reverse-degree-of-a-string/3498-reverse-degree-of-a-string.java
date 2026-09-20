class Solution {
    public int reverseDegree(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            c += (26 - (ch - 'a')) * (i + 1);
        }

        return c;
    }
}