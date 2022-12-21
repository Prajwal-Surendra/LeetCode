class Solution {
    public int[] countBits(int n) {
        int p[]= new int[n+1];
        for(int i = 0 ; i <= n ; i++ )
            p[i] = hammingWeight(i);
        return p;
    }
    public int hammingWeight(int n) {
        int count =0; 
        while(n!=0)
        {
            count = count + (n & 1);
            n>>>=1;
        }
        return count;
    }
}