class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[s.length - i-1];
            s[s.length-i-1]=s[i];
            s[i]=temp;
        }
    }
}