class Solution:
    def scoreOfString(self, s: str) -> int:
        ans=0
        s = [ord(char) for char in s]
        for i in range(len(s)-1):
            ans += abs (s[i]-s[i+1]) 
        return ans
