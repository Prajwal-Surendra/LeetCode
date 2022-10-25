class Solution {
    public int maxProfit(int[] prices) {
        int maxc=0,maxs=0;
        for(int i =1 ; i< prices.length ; i++)
        {
            maxc+=prices[i]-prices[i-1];
            maxc=Math.max(0,maxc);
            maxs=Math.max(maxc,maxs);
        }
        return maxs;
    }
}