class Solution {
    public int search(int[] nums, int target) {
        int pivot=Pivot(nums);
        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length-1);
        if(nums[pivot]==target)
            return pivot;
        if(target>= nums[0])
            return binarySearch(nums,target,0,pivot-1);
        return binarySearch(nums,target,pivot+1,nums.length-1);
        
    }
    int Pivot(int nums[])
    {
        int end= nums.length-1;
        int start=0;
        while(start<end)
        {
            int mid= (start + end)/2;
            if(mid < end && nums[mid]>nums[mid+1])
                return mid;
            if(mid > start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[mid]<=nums[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    int binarySearch(int nums[],int target,int start, int end)
    {
        while(start<=end)
        {
            int mid=(start + end)/2;
            if(nums[mid]<target)
                start=mid+1;
            else if(nums[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}