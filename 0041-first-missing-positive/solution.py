class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = 1
        nums = set(nums)
        while m in nums:
            m+=1
        return m
        
