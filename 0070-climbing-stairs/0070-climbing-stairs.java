class Solution {
    public int climbStairs(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int sum=0;
        int val=2,k=1;
        for(int i = 2; i<n;i++)
        {
            sum=val+k;
            k=val;
            val=sum;
        }
        return val;
    }
}