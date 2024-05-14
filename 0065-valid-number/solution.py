class Solution(object):
    def isNumber(self, s):
        for i in str(s):
            if i.isdigit():
                try:
                    float(s)
                    return True
                except:
                    return False
        return False
        
