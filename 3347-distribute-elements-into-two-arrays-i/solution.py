class Solution(object):
    def resultArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        a=[nums[0]]
        b=[nums[1]]
        i=0
        j=0
        for l in nums[2:]:
            if a[i]>b[j]:
                i+=1
                a.append(l)
            else :
                j+=1
                b.append(l)
        return a+b


