class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int longest=1;
        // int cnt;
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums) {
            set.add(i);
        }
        
        for(int i:set) {
            if(!set.contains(i-1)) {
                int cnt=1;
                // int x=i;
                while(set.contains(i+1)){
                    i++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}