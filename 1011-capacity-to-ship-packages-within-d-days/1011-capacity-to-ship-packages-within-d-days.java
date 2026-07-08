import java.util.*;

class Solution {

    static boolean check(int[] weights, int days, int capacity) {

        days = days - 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {

            if (sum + weights[i] > capacity) {
                days--;
                sum = 0;

                if (days< 0)
                    return false;
            }

            sum += weights[i];
        }

        return true;
    }

    public int shipWithinDays(int[] weights, int days) {

        int l = 0, r = 0;

        for (int i = 0; i < weights.length; i++) {
            l= Math.max(l, weights[i]);
            r += weights[i];
        }

        int ans = r;

        while (l<= r) {

            int mid = l + (r - l) / 2;

            if (check(weights, days, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}