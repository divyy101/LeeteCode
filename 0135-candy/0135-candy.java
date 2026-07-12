class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int ans = 1;
        int high = 1;
        int low = 0;
        int p = 1;

        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) {
                high++;
                p = high;
                low = 0;
                ans += high;
            }

            else if (ratings[i] == ratings[i - 1]) {
                high = 1;
                low = 0;
                p = 1;
                ans += 1;
            }

            else {
                low++;
                high = 1;
                ans += low;

                if (low >= p) {
                    ans++;
                }
            }
        }

        return ans;
    }
}