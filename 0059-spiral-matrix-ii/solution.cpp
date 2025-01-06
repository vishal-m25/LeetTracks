class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> res(n, vector<int>(n, 0));
        int drow[] = {0, 1, 0, -1};
        int dcol[] = {1, 0, -1, 0};

        int len = n, direction = 0;
        int num = 1;
        int row = 0, col = -1;

        while (num <= n * n) {
            if (direction == 1 || direction == 3) len--;
            for (int i = 0; i < len; i++) {
                row = row + drow[direction];
                col = col + dcol[direction];
                if (row >= 0 && row < n && col >= 0 && col < n) {
                    res[row][col] = num;
                }
                num++;
            }
            direction = (direction + 1) % 4;
        }
        return res;
    }
};
