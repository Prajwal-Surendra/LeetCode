class Solution {
    static public int removeDuplicates(int[] nums) {
        int k=0;
        int[] enums=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[k])
                nums[++k]=nums[i];
        }
        return ++k;
    }
    
}