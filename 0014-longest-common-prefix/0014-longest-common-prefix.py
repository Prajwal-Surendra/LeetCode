class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        s1=min(strs)
        s2=max(strs)
        for i ,n in enumerate(s1):
            if n!=s2[i]:
                return s1[:i]
        return s1