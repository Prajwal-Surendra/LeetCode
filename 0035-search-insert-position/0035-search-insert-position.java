class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int l=0,h=nums.length - 1, mid;
        while(l<=h)
        {
            mid= (l+h)/2;
            if(nums[mid]== target)
                return mid;
            else if ( nums[mid]> target)
                h=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}