class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        lastA, count = 0,  0
        for  i, num in enumerate(nums):
            if num == 1: 
                count += 1  
            if (num == 0 or len(nums)-1 == i):
                lastA = max(lastA, count)
                count = 0
                print(i)
        return lastA
