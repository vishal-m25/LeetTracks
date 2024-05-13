class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums)==1 and nums[0]==target:
            return [0,0]
        s=-1
        e=-1
        try:
            s=nums.index(target)
            e=nums.index(target,s+nums.count(target)-1)
            print(s,e)
            return [s,e]
        except (Exception):
            if s!=-1:
                return [s,s]
            return[s,e]
