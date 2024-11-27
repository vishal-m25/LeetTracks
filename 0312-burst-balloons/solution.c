int maxCoins(int* nums, int numsSize) {
    if (nums == NULL || numsSize == 0) {
        return 0;
    }
    int** dp = (int**)malloc(sizeof(int*) * numsSize);
    for (int i = 0; i < numsSize; i++) {
        dp[i] = (int*)calloc(numsSize, sizeof(int));
    }
    for (int len = 1; len <= numsSize; len++) {
        for (int start = 0; start <= numsSize - len; start++) {
            int end = start + len - 1;
            for (int k = start; k <= end; k++) {
                int leftNum = (start > 0) ? nums[start - 1] : 1;
                int rightNum = (end < numsSize - 1) ? nums[end + 1] : 1;

                int left = (k > start) ? dp[start][k - 1] : 0;
                int right = (k < end) ? dp[k + 1][end] : 0;
                dp[start][end] = fmax(dp[start][end], left + (leftNum * nums[k] * rightNum) + right);
            }
        }
    }
    int result = dp[0][numsSize - 1];
    for (int i = 0; i < numsSize; i++) {
        free(dp[i]);
    }
    free(dp);

    return result;
}
