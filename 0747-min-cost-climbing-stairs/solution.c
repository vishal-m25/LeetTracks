int minCostClimbingStairs(int* cost, int costSize) {
    int *dp = calloc(costSize, sizeof(int));
    if(costSize == 0) return 0;
    dp[0] = cost[0];
    if(costSize > 1) dp[1] = cost[1];
    for(int i = 2; i < costSize; i++){
        if(dp[i-1] < dp[i-2]) dp[i] = dp[i-1] + cost[i];
        else dp[i] = dp[i-2] + cost[i];
    }

    return (dp[costSize-1] < dp[costSize-2]) ? dp[costSize-1] : dp[costSize-2];
}
