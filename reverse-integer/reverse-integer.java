class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int digit=x%10;
            int nrev=rev*10 + digit;
            if((nrev-digit)/10 != rev)
                return 0;
            rev=nrev;
            x/=10;
        }
        return rev;
    }
}