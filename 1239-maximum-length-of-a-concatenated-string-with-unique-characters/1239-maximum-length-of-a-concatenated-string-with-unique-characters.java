class Solution {
    public int maxLength(List<String> arr) {
        List<String> r=new ArrayList<String>();
        r.add("");
        for(String str : arr)
        {
            if(!isUnique(str))
                continue;
            List<String> s=new ArrayList<String>();
            for(String n : r)
            {
                String temp=n+str;
                if(isUnique(temp))
                    s.add(temp); 
            }
            r.addAll(s);
        }
        int max=0;
        for(String a: r)
            max=Math.max(max,a.length());
        return max;
    }
    public boolean isUnique(String str)
    {
        if(str.length() > 26)
            return false;
        boolean[] map= new boolean[26];
        for(char c : str.toCharArray())
        {
            if(map[c-'a'])
                return false;
            else
                map[c-'a']=true;
        }
        return true;
    }
}