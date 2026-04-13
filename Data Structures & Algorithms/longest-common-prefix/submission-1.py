class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        prefix = ""
        # zip(*strs) pairs characters by index: (char1, char1, char1), (char2, char2, char2)...
        for chars in zip(*strs):
            if len(set(chars)) == 1: # If all characters in this column are the same
                prefix += chars[0]
            else:
                break
        return prefix