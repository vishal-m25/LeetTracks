class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        int[][] dp = new int[m][n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // base case
                if (i == m - 1 && j == n - 1) {
                   dp[i][j] = dungeon[m - 1][n - 1] >= 0 ? 1 : - dungeon[m - 1][n - 1] + 1;
                    continue;
                }
                
                int down = i + 1 == m ? 2000000 : dp[i + 1][j];
                int right = j + 1 == n ? 2000000 : dp[i][j + 1];
                
                int res = Math.min(
                    down - dungeon[i][j],
                    right - dungeon[i][j]
                );
                
                res = res <= 0 ? 1 : res;
                
                dp[i][j] = res;
            }
        }
        
        return dp[0][0];
    }
}
