class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        l = []
        count = 0

        for  i, num in enumerate(nums):
            if num == 1: count += 1
            if num == 0 or len(nums)-1 == i:
                l.append(count)
                count = 0 
        print (l)
        return max(l)
