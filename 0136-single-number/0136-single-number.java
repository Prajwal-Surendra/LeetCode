class Solution {
    public int singleNumber(int[] A) 
    {
        
       Set<Integer> s = new HashSet<Integer>();
	    for (int i: A)
        {
	    	if(!s.add(i))
            {
	    		s.remove(i);
	    	}
	    }
	    return s.iterator().next();
    }
}
