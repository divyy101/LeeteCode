class Solution {
    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int l = 0;

        while (l <= right) {
            long sum = 1L * l * l + 1L * right * right;

            if (sum == c)
                return true;
            else if (sum < c)
                l++;
            else
                right--;
        }

        return false;
    }
}