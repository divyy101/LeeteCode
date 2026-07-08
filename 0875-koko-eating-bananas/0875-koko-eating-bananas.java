class Solution {

    static boolean check(int[] piles, int h, int k) {
        int s = 0;

        for (int i = 0; i < piles.length; i++) {
            s += (piles[i] + k - 1) / k;

            if (s > h)
                return false;
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max)
                max = piles[i];
        }

        int l = 1;
        int r = max;
        int ans = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (check(piles, h, m)) {
                ans = m;
                r = m - 1;
            }
        else {
                l = m + 1;
            }
        }

        return ans;
    }
}