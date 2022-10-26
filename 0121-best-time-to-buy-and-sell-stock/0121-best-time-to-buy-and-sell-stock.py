class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxp=prices[len(prices)-1]
        profit=0
        for i in prices[::-1]:
            if maxp - i > profit:
                profit= maxp - i
            if i > maxp:
                maxp=i
        return profit