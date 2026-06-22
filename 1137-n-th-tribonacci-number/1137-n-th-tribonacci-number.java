class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==2||n==1){
            return 1;
        }
        else{
            int fir=0,sec=1,thrd=1;
            for(int i=1;i<=n;i++){
                int fourth=fir+sec+thrd;
                fir=sec;
                sec=thrd;
                thrd=fourth;
            }
            return fir;
        }
        
    }
}