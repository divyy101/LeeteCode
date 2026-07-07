class Solution {
    public int reverseBits(int n) {
        int res = 0,c=0;
        while(n!=0){
                res=res<<1;
            if(n%2==1){
                res=res|1;
            }
        
            n=n>>1;
            c++;
        }
        res=res<<32-c;

     return res;
    }
}