class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right) {
            int min = Math.min(height[left],height[right]);
            int sep = right - left;
            area = Math.max(area, min * sep);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return area;
    }
}