class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int c=matrix.size();
        int r=matrix[0].size();
        int m=0,n=r-1;
        // if(c==1 && r==1 && matrix[c][r]==target)return true;
        // else return false;
        while(m<c && n>=0){
            if(matrix[m][n]==target)
            return true;
            else if(matrix[m][n]>target){
                n--;
            }
            else{
                m++;
            }
        }
        return 0;
    }
};
