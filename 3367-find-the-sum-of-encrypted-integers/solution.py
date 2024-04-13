class Solution(object):
    def sumOfEncryptedInt(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=0
        for i in nums:
            i=str(i)
            s+=int(max(i)*len(i))
        return s
