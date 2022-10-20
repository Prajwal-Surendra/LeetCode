class Solution {
    public void rotate(int[] nums, int k)
    {
        int a[]= new int[nums.length];
        int j=0;
        if(k>=nums.length)
            k%=nums.length;
        for(int i=nums.length-k-1;i>=0;i--,j++)
            a[j]=nums[i];
        for(int i=nums.length-1; i>=nums.length-k;i--,j++)
            a[j]=nums[i];
        for(int i =nums.length-1;i>=0;i--)
            nums[nums.length-i-1]=a[i];
        
    }
}