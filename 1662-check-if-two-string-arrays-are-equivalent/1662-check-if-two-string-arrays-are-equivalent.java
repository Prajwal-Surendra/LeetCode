class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arr1=0,arr2=0,idx1=0,idx2=0;
        while(arr1<word1.length && arr2<word2.length)
        {
            if(word1[arr1].charAt(idx1) != word2[arr2].charAt(idx2))
                return false;
            idx1=(++idx1)% word1[arr1].length();
            idx2=(++idx2)% word2[arr2].length();
            if(idx1==0)
                arr1++;
            if(idx2==0)
                arr2++;
        }
        return arr1==word1.length && arr2==word2.length;
    }
}