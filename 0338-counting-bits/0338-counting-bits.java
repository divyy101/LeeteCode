class Solution {
    public int[] countBits(int n) {
        int []countBits=new int[n+1];
        int count=0;
        for(int i=1;i<n+1;i++){
            int num=i;
        while(num!=0){
            count+=(num&1);
            num=num>>1;


        }
       
            countBits[i]=count;
            count=0;
        }
        return countBits;
        
    }
}