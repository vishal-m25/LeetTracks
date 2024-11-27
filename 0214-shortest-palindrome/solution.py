class Solution:
    def shortestPalindrome(self, s):
        if all(map(eq, s, reversed(s))):
            return s

        n = len(s)
        z, l, r = [0] * n, 0, 0
        for i in range(1, n):
            if i <= r:
                z[i] = min(r - i + 1, z[i - l])
            while i + z[i] < n and s[z[i]] == s[~(i + z[i])]:
                z[i] += 1

            if z[i] == n - i:
                return s[:z[i]-1:-1] + s

            if i + z[i] - 1 > r:
                r = i + z[i] - 1
                l = i
