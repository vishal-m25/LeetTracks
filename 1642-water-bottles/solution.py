class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        """
        :type numBottles: int
        :type numExchange: int
        :rtype: int
        """
        
        temp=numBottles
        while temp>=numExchange :
            ex=temp/numExchange
            rem=temp%numExchange
            numBottles+=ex
            temp=ex+rem
        return numBottles

            

            
