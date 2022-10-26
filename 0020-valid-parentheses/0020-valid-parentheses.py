class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        c={
            ']' : '[',
            ')' : '(',
            '}' : '{'
        }
        for i in s:
            if i in c:
                if stack and stack[-1] == c[i]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        if not stack:
            return True
        else:
            return False