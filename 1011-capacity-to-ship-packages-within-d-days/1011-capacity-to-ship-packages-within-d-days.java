import java.util.*;

class Solution {

    static boolean check(int[] weights, int days, int capacity) {

        days = days - 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {

            if (sum + weights[i] > capacity) {
                days--;
                sum = 0;

                if (days < 0)
                    return false;
            }

            sum += weights[i];
        }

        return true;
    }

    public int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;

        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (check(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}