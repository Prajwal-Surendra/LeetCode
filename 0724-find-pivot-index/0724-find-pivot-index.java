class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,total=0;
        for(int i = 0 ; i < nums.length ; i++)
            total+=nums[i];
        for(int i = 0 ; i < nums.length ; i++)
        {
            left += nums[i];
            if ( total - left == left - nums[i])
                return i;
        }
        return -1;
    }
}