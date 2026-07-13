class NumArray {
    int[] ft;
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        ft = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < ft.length) {
                ft[j] += nums[i];
                j += j & -j;
            }
        }
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;

        int j = index + 1;
        while (j < ft.length) {
            ft[j] += diff;
            j += j & -j;
        }
    }

    public int sumRange(int left, int right) {
        int rightSum = 0, leftSum = 0;

        int j = right + 1;
        while (j > 0) {
            rightSum += ft[j];
            j -= j & -j;
        }

        j = left;
        while (j > 0) {
            leftSum += ft[j];
            j -= j & -j;
        }

        return rightSum - leftSum;
    }
}