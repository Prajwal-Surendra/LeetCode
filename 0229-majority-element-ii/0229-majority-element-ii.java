class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i: nums) {
            int feq = map.getOrDefault(i,0);
            if(feq>(nums.length/3)) {
                if(!list.contains(i)) {
                    list.add(i);    
                }
            }
        }
        return list;
    }
}