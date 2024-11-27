class Solution(object):
    def calculate(self, s):
        stack = []
        cur,ans = 0,0
        sign = 1
        for c in s:
            if c.isdigit():
                cur = cur*10 + int(c)
            elif c in '+-':
                ans += sign*cur
                sign = -1 if c == '-' else 1
                cur = 0
            elif c == '(':
                stack.append(ans)
                stack.append(sign)
                ans = 0
                sign = 1
            elif c == ')':
                ans += sign*cur
                ans *= stack.pop()
                ans += stack.pop()
                cur = 0
        return ans + sign*cur
        
