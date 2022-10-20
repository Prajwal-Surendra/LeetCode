class Solution {
    public int pivotIndex(int[] nums) {
        for(int k=0;k<nums.length;k++)
        {
            int suml=0,sumr=0;
            if(k==0)
            {
                for(int j=k+1;j<nums.length;j++)
                    sumr+=nums[j];
                if(sumr==0)
                    return k;
            }
            else if(k==nums.length-1)
            {
                for(int i=0;i<k;i++)
                    suml+=nums[i];
                if(suml==0)
                    return k;
            }
            else
            {
                for(int i=0;i<k;i++)
                    suml+=nums[i];
                for(int j=k+1;j<nums.length;j++)
                    sumr+=nums[j];
                if(suml==sumr)
                    return k;
            }
        }
        return -1;
    }
}