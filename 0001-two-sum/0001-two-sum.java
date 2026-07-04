class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> hm= new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[0]=i;
            }
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==target-nums[i]){
                        ans[1]=j;
                        return ans;
                    }
                }
            }
        return ans;
        }




    }
            
           