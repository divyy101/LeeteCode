class Solution {
    public boolean checkDivisibility(int n) {
        int s=n;
        int c=0,k=1;
        while(n!=0){
            int d=n%10;
            c=c+d;
            k=k*d;
            n=n/10;
        }
        if(s%(c+k)==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}