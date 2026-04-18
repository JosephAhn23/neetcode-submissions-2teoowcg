class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]: 
        final = {}
        for text in strs:
            sorted_text = "".join(sorted(text))  
            if sorted_text not in final:
                final[sorted_text] = []
            final[sorted_text].append(text)
        return list(final.values()) 