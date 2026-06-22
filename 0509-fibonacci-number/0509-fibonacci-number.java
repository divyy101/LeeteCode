class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
          int  fir=0;
          int  sec=1;
            for(int i=1;i<=n;i++){
                int sum=fir+sec;
                fir=sec;
                sec=sum;
            }
            return fir;
        }
    }
}