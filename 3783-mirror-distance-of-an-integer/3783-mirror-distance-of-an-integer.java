class Solution {
    public int mirrorDistance(int n) {
        int c=n;
        int x=0;
        while(n!=0){
            int d=n%10;
            x=x*10+d;
            n=n/10;
        }
        return Math.abs(c-x);
        
    }
}