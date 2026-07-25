class Solution {
    public int pivotIndex(int[] nums) {
        int ans[]=new int [nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        int left,right,total=ans[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left=0;
                
            }
            else{
                left=ans[i-1];
            }
            right=total-ans[i];
            if(right==left)
            return i;
            
        }
        return -1;
    }
}