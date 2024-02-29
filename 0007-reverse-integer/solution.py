class Solution(object):
    def reverse(self, x):
        if x>=((2**31)-1) or x<=(-2)**31:
            return 0
        if x<0:
            t=(int(str(x*-1)[::-1])*-1)
        else:
            t=int(str(x)[::-1])
        if t>=((2**31)-1) or t<=(-2)**31:
            return 0
        else:
            return t
        
        
