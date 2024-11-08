class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=set([i for i in range(len(nums)+1)])
        z=l-set(nums)
        return list(z)[0]
        
