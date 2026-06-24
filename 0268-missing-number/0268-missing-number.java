class Solution {
    public int missingNumber(int[] nums) {
        int x=nums.length ,sum=0;
        int len=(x*(x+1)/2);
        for(int i=0;i<x;i++){
            sum=sum+nums[i];
        }
        int ans= len-sum;
        return ans;
    }
}