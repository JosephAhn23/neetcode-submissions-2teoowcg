class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s2 = s.split()
        return len(s2[-1])