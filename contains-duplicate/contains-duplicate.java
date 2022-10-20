class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> u = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(u.contains(nums[i]))
               return true; 
            u.add(nums[i]);
        }
        return false;
    }
}