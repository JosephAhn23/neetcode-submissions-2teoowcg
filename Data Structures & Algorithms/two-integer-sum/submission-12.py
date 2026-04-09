class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictionaryhashmap = {}
        for i, n in enumerate(nums):
            diff = target - n
            if diff in dictionaryhashmap:
                return [dictionaryhashmap[diff], i]

            dictionaryhashmap[n] = i