class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(ans,0,nums,list);
        return ans;   
    }
    
    public void dfs(List<List<Integer>> ans, int start, int[] nums, List<Integer> list) {
        if(start == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[start]);
        dfs(ans, start + 1, nums, list);
        
        list.remove(list.size() - 1);
        dfs(ans, start + 1, nums, list);
        }
}