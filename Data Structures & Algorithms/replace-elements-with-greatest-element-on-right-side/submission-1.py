class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        a = arr
        ans = []
        
        for a_part in a[:]:
            a.remove (a_part) 
            #shifted array to right
            if a: 
                ans.append(max(a))
            else: 
                ans.append(-1) 

        return ans