class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        try:
            i=haystack.index(needle)
            return i
        except (Exception ):
            return -1
        
        
