class Solution {
    public void nextPermutation(int[] nums) {
        
        int index=-1;
        for(int i = nums.length-2;i>=0;i--) {
            if(nums[i]<nums[i+1]) {
                index=i;
                break;
            }
        }
        
        if(index == -1) {
            reverse(nums,index+1,nums.length-1);
            return;
        }
        
        for(int i=nums.length-1;i>=index;i--) {
            if(nums[i]>nums[index]) {
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
    
    static void reverse(int[] arr, int i , int j){
        while(i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
    static void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}