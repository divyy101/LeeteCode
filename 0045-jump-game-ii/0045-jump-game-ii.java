class Solution {
    public int jump (int[] nums) {
        int j = 1;
        int max = nums[0];
        int  last= max;
        if(nums.length==1){
            return 0;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);

            if (i == last) {
                j++;
                last= max;
                if(max>=nums.length-1){
                    

                    break;
                }
            }
        }

        return j;
    }
}