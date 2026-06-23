class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>ans= new ArrayList<>();
         int p=num.length-1,carry=0;
         while(p>=0||k>0){
            int x=0;
            if(p>=0){
                x=num[p];
                p--;
            }
            int d=k%10;
            k=k/10;
            int sum=x+d+carry;
            int digit=sum%10;
            carry=sum/10;
            ans.add(digit);
         }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}