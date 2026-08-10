class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c = 1, max = 1;
        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] < nums[j]) {
                c++;
            } else {
                c = 1;
            }

            max = Math.max(max, c);
            i = j;
            j++;
        }

        return max;
    }
}