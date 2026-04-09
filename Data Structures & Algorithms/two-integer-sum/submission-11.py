class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = 0  
        for i, num in enumerate(nums):
            if len(nums) == 2 and nums[0]+nums[1]==target:
                return [0,1]

            if target - num in nums and i != nums.index(target-num): 
                return sorted ([i, nums.index(target-num)])
        return []
            