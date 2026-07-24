class Solution {
    public int countDigits(int num) {
        int x=num,c=0;
        while(x!=0){
            int d=x%10;
            x=x/10;
            if(num%d==0){
                c++;

            }
        }
        return c;
        
    }
}