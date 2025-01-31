class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int rows = matrix.size();  
        int cols = matrix[0].size();  
        for (int row = rows - 2; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                int downRight = INT_MAX;  
                int downLeft = INT_MAX;   
                if (col + 1 < cols) {
                    downRight = matrix[row + 1][col + 1];
                }
                if (col - 1 >= 0) {
                    downLeft = matrix[row + 1][col - 1];
                }
                matrix[row][col] += min({matrix[row + 1][col], downLeft, downRight});
            }
        }
        return *min_element(matrix[0].begin(), matrix[0].end());
    }
};

