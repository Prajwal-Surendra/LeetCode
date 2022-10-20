class Solution {
    public int maxProfit(int[] prices) {
        int i=0,profit=0;
        while(i<prices.length)
        {
            while(i<prices.length-1 && prices[i+1]<=prices[i])
                i++;
            int min=prices[i++];
            while(i<prices.length-1 && prices[i+1]>=prices[i])
                i++;
            if(i<prices.length)
                profit+=prices[i++]-min;
            else
                profit+=0;

        }
        return profit;
    }
}