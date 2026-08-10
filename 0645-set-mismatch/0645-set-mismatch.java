class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);

        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                ans[0] = nums[i]; // duplicate
                break;
            }
            i++;
            j++;
        }

        for (int k = 1; k <= nums.length; k++) {
            if (Arrays.binarySearch(nums, k) < 0) {
                ans[1] = k; // missing
                break;
            }
        }

        return ans;
    }
}