class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resultl = new ArrayList<>();
        for(int i : nums1) {
            set.add(i);
        }
        for(int i : nums2) {
            if(set.contains(i)) {
                resultl.add(i);
                set.remove(i);
            }
        }
        
        int a[] = new int[resultl.size()];
        for(int i=0; i<resultl.size();i++) {
            a[i] = resultl.get(i);
        }
        return a;
    }
}