class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        if( nums3.length % 2 == 0) {
            int a = nums3[nums3.length / 2];
            int b = nums3[(nums3.length / 2) - 1];
            double c =(double)(a+b)/2;
            return c;
        }
        else {
            return (double)nums3[nums3.length/2];
        }
    }
}