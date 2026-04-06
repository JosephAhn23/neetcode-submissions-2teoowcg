class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s1 = "".join(s)
        pastPosition = -1

        for s_parts in s1:
            currPosition = t.find(s_parts, pastPosition + 1)
            if currPosition == -1:
                return False
            pastPosition = currPosition
        return True