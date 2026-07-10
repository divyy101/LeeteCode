class Solution {
    public int jump (int[] nums) {
        int j = 0;
        int max = 0;
        int  last= 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);

            if (i == last) {
                j++;
                last= max;
            }
        }

        return j;
    }
}