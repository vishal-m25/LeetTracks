class Solution {
    int mod=(int)1000000007;
    private int solve(int n,int cntA,int cntConsL,int[][][]dp){
        if(n==0){
            if(cntA<2 && cntConsL<3)
            return 1;
            else
            return 0;
        }
        if(cntA>=2 || cntConsL>=3)
        return 0;
        if(dp[n][cntA][cntConsL]!=-1)
        return dp[n][cntA][cntConsL];
        //optoon 1-take A
        int opt1=solve(n-1,cntA+1,0,dp);
        //option-2-take L
        int opt2=solve(n-1,cntA,cntConsL+1,dp);
        //option 3
        int opt3=solve(n-1,cntA,0,dp);
        return dp[n][cntA][cntConsL]=(opt1+(opt2+opt3)%mod)%mod;
    }
    public int checkRecord(int n) {
        int dp[][][]=new int[n+1][2][3];
        for(int [][]matrix:dp){
            for(int[] row:matrix){
                Arrays.fill(row,-1);
            }
        }
        return solve(n,0,0,dp)%mod;
    }
}
