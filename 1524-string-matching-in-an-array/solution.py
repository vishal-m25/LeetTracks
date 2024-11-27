class Solution(object):
    def stringMatching(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        arr = ' '.join(words)
        subStr = [i for i in words if arr.count(i) >= 2]
                
        return subStr
		
