class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] c=new int[26];
        for(int i=0;i<s.length();i++)
            c[s.charAt(i) - 'a']++;
        for(int i=0;i<t.length();i++)
            c[t.charAt(i) - 'a']--;
        for(int a: c)
            if(a!=0)
                return false;
        return true;
    }
}