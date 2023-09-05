class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        
        while(i>=0 && nums[i]>=nums[i+1]) {
            i--;
        }
        
        
        if(i>=0) {
            int j = n-1;
            while(j>i && nums[j]<=nums[i]) {
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        
        int left = i+1;
        int right = n-1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}