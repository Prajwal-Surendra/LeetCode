class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++) {
            ans.add(nCr(row));
        }
        return ans;
    }
    public static List<Integer> nCr(int row) {
        long ans = 1;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for(int col=1;col<row;col++) {
            ans= ans*(row-col);
            ans=ans/col;
            res.add((int)ans);
        }
        return res;
    }
}