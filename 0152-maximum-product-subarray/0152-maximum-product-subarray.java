class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        for(int i = 1; i<nums.length; i++) {
            if(nums[i]<0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd*nums[i]);
            minProd = Math.min(nums[i], minProd*nums[i]);
            result = Math.max(maxProd, result);
        }
        return result;
    }
}