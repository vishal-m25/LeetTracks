class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        int m = triangle.size();
        vector<int> dp(m, 0);
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == m - 1) {
                    dp[j] = triangle[i][j];  
                } else {
                    dp[j] = triangle[i][j] + min(dp[j], dp[j + 1]);  
                }
            }
        }
        return dp[0];  
    }
};

