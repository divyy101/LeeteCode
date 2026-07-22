class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
       int minProfit=prices[0];
      
        
        for(int i=1;i<prices.length;i++){
        minProfit=Math.min(minProfit,prices[i]);
        int profit;
        profit=prices[i]-minProfit;
        max=Math.max(profit,max);
          
        }
        return max;
    }
}