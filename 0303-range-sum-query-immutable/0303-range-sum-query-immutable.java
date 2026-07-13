class NumArray {

 int ans[];
    public NumArray(int[] nums) {
          this.ans=new int[nums.length];
       
        this.ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            this.ans[i]=ans[i-1]+nums[i];
        }
     

        
    }
    
    public int sumRange(int left, int right) {
        if (left==0)
          return ans[right];

        else
          return this.ans[right]-this.ans[left-1]; 
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */