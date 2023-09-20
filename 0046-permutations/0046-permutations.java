class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        helper(list, freq, nums, ans);
        return ans;
    }
    
    void helper(List<Integer> list, boolean[] freq, int[] nums, List<List<Integer>> ans) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0; i<nums.length;i++) {
            if(!freq[i]) {
                freq[i]=true;
                list.add(nums[i]);
                helper(list, freq, nums, ans);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
}