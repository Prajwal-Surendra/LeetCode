class Solution:
    def isPalindrome(self, s: str) -> bool:
        newstr=""
        for a in s:
            if a.isalnum():
                newstr+=a.lower()
        return newstr==newstr[::-1]