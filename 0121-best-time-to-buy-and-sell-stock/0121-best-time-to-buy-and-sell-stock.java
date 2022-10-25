class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <=1)
            return 0;
        int minc=prices[0],profit=0;
        for(int i=1;i<prices.length ; i++)
        {
            if(prices[i]<minc)
                minc=prices[i];
            else
                profit=Math.max(profit,prices[i]-minc);
        }
        return profit;
    }
}