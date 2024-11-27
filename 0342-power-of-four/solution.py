class Solution(object):
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if(n == 1):
            return True
        if(n % 4 != 0 or n <= 0):
            return False
        num = 1
        while(num <= n):
            num *= 4
            if(num == n):
                return True
            elif(num > n):
                return False
