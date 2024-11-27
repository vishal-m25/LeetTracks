class Solution {
    public int integerBreak(int n) {
        if(n == 2 || n == 3){
            return n-1;
        }
        
        int[]dp = new int[n+1];
        if(dp[n]!=0){
            return dp[n];
        }
        return recursion(n, dp);
    }


    public int recursion(int n, int[] dp){
        if(n == 2 || n == 3){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }
        
        for(int i = 2; i<=n/2; i++){
            dp[n] = Math.max(dp[n], recursion(i, dp) * recursion(n-i, dp));
        }

        return dp[n];
    }
}
