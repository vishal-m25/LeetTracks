class Solution {
public:
    void cal(vector<vector<char>>& grid,int m,int n,int a,int b){
        grid[a][b]='0';
        if(a+1<m &&  grid[a+1][b]=='1'){cal(grid,m,n,a+1,b);}
        if(b+1<n &&  grid[a][b+1]=='1'){cal(grid,m,n,a,b+1);}
        if(a-1>-1 &&  grid[a-1][b]=='1'){cal(grid,m,n,a-1,b);}
        if(b-1>-1 &&  grid[a][b-1]=='1'){cal(grid,m,n,a,b-1);}
        
    }
    int numIslands(vector<vector<char>>& grid) {
        int c=0;
        int m=grid.size(),n=grid[0].size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    cal(grid,m,n,i,j);
                    c+=1;
                }
            }
        }
        return c;

    }
};
