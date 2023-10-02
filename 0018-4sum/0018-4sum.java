class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(i>0 && nums[i]== nums[i-1]) {
                continue;
            }
            for(int j=i+1; j<n; j++) {
                if(j!= i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int left = j+1;
                int right = n-1;
                while(left<right) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[left];
                    sum += nums[right];
                    if(sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(new ArrayList(list));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) {
                            left++;
                        }
                        while(left<right && nums[right] == nums[right+1]) {
                            right--;
                        }
                    }
                    else if(sum>target){
                        right--;
                        while(left<right && nums[right] == nums[right+1]) {
                            right--;
                        }
                    }
                    else {
                        left++;
                        while(left<right && nums[left]==nums[left-1]) {
                            left++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}