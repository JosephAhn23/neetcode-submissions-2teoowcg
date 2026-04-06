class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        t1 = {}
        s1 = {}
        for t_part in t: 
            t1[t_part] = t1.get(t_part, 0) + 1
    
        for s_part in s:
            s1[s_part] = s1.get(s_part, 0) + 1
        print(t1)
        print(s1)
        return t1 == s1