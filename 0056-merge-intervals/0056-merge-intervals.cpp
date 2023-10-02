class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& in) {
        vector<vector<int>> v;

        int s=0,e=0,n=in.size();

        sort(in.begin(),in.end());
        for(int i=0;i<n;i++){
            if(v.empty() || v.back()[1]<in[i][0]){
                v.emplace_back(in[i]);
            }
            else{
                v.back()[1] = max(v.back()[1],in[i][1]);
            }
        }
        
        return v;
    }
};