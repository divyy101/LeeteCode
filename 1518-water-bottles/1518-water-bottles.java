class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int ans=numBottles;
        while(numBottles>=numExchange){
            int x=numBottles/numExchange;
            ans=ans+x;
        int rem=numBottles%numExchange;
        numBottles=x+rem;
        }
        return ans;
    }
}