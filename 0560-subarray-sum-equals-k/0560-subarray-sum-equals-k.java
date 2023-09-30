class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        int sum=0;
        int cnt=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            int remove=sum-k;
            cnt+= map.getOrDefault(remove,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}