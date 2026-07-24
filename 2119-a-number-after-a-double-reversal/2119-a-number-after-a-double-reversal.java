class Solution {
    public boolean isSameAfterReversals(int num) {
        int x=num,rev=0,rev1=0;
        while(x!=0){
            int d=x%10;
             rev =rev*10+d;
            x=x/10;
        }
        while(rev!=0){
            int k=rev%10;
            rev1=rev1*10+k;
            rev=rev/10;
        }
        return num==rev1;
        
    }
}