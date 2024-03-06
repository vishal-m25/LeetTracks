class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        d={1:"I",5:"V",10:"X",50:"L",100:"C",500:"D",1000:"M",900:"CM",90:"XC",4:"IV",9:"IX",40:"XL",400:"CD"}
        l=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        s=""
        for i in l:
            while num>=i:
                num-=i
                s+=d[i]
        return s
