class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    public static void dfs(int ind , int[] arr,int target, List<List<Integer>> ans, List<Integer> list) {
        
        if(ind == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target) {
            list.add(arr[ind]);
            dfs(ind, arr, target-arr[ind], ans, list);
            list.remove(list.size()-1);
        }
        dfs(ind+1, arr, target, ans, list);
    }
}