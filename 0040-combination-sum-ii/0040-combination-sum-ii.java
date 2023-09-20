class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    
    public static void dfs(int ind , int[] arr,int target, List<List<Integer>> ans, List<Integer> list) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=ind; i<arr.length; i++) {
            if(i>ind && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            
            list.add(arr[i]);
            dfs(i+1, arr, target-arr[i], ans, list);
            list.remove(list.size()-1);
        }
        // dfs(ind+1, arr, target, ans, list);
    }
}
