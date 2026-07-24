class Solution {
    public int subtractProductAndSum(int n) {
        int i=0,j=1;
        while(n!=0){
            int d=n%10;
            n=n/10;
            i=i+d;
            j=j*d;

        }
        return j-i;
        
    }
}