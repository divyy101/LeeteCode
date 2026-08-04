class Solution {
    public int[] applyOperations(int[] nums) {

        // Step 1: Apply operations
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Two pointers
        int l = 0, r = 0;

        while (r < nums.length) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }

        return nums;
    }
}