class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;

        int z = 3;
        int x = 2;
        int cur = 0;

        for (int i = 3; i < n; i++) {
            cur = z + x;
            x = z;
            z = cur;
        }

        return cur;
    }
}
