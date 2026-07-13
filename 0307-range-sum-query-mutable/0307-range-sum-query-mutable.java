class NumArray {
    int[] ft;
    int[] arr;

    public NumArray(int[] nums) {
        arr = nums;             
        ft = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            updateFT(i + 1, nums[i]);
        }
    }

    void updateFT(int l, int r) {
        int i = l;

        while (i < ft.length) {
            ft[i] = ft[i] + r;
            i = i + (i & -i);
        }
    }

    int rangeSum(int r) {
        int i = r;
        int sum = 0;

        while (i > 0) {
            sum = sum + ft[i];
            i = i - (i & -i);
        }

        return sum;
    }

    public void update(int index, int val) {
        int dif = val - arr[index];
        arr[index] = val;

        updateFT(index + 1, dif);
    }

    public int sumRange(int left, int right) {
        return rangeSum(right+1 ) - rangeSum(left);
    }
}