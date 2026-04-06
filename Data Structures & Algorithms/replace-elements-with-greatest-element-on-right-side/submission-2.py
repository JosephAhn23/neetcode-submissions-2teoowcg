class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        a = arr
        ans = []
        
        for a_part in a[:-1]:
            a.remove (a_part) 
            #shifted array to right 
            ans.append(max(a)) 
        ans.append(-1) 

        return ans