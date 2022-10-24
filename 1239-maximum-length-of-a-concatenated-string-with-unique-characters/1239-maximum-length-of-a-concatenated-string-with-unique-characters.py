class Solution:
    def maxLength(self, arr: List[str]) -> int:
        d = [set()]
        for a in arr:
            if len(set(a)) < len(a):
                continue;
            a=set(a)
            for c in d[:]:
                if a & c:
                    continue;
                d.append(a|c)
        b=0
        for p in d:
            if b < len(p):
                b=len(p)
        return b