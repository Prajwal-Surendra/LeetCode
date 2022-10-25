class Solution {
    public int search(int[] nums, int target) {
        int h=nums.length-1;
        int l=0,mid;
        if(nums.length == 1 && target == nums[0])
            return 0;
        while(l<=h)
        {
            mid= (l + h)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}