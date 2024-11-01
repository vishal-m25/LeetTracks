class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hm = defaultdict(int)

        for i in nums:
            hm[i]+=1
            
            if hm[i] == 3:
                hm.pop(i)

        return list(hm.keys())[0]
        
