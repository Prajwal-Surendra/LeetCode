class Solution {
    public String mergeAlternately(String word1, String word2) {
        char str1[] = word1.toCharArray();
        char str2[] = word2.toCharArray();
        StringBuilder res = new StringBuilder();
        int l1= 0;
        int l2 = 0;
        int count = 0;
        while(l1 <str1.length && l2<str2.length) {
            if(count%2 == 0){
                res.append(str1[l1]);
                l1++;
            }
            else {
                res.append(str2[l2]);
                l2++;
            }
            count++;
        }
        if(l1 == str1.length) {
            res.append(word2.substring(l2));
        }
        else {
            res.append(word1.substring(l1));
        }
        return res.toString();
    }
}