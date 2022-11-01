class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if( strs == null || strs.length == 0)
            return new ArrayList<>();
        Map <String , List<String>> map = new HashMap<>();
        for(String a : strs)
        {
            char ca[]=a.toCharArray();
            Arrays.sort(ca);
            String c = new String(ca);
            if(!map.containsKey(c))
                map.put(c,new ArrayList<>());
            map.get(c).add(a);
        }
        return new ArrayList<>(map.values());
    }
}