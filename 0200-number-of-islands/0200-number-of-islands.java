class Solution {
    public int numIslands(char[][] grid) {
        int max_islands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    checkIsland(grid, i, j, grid.length, grid[0].length);
                    max_islands += 1;
                }
            }
        }
        return max_islands;
    }
      public  void checkIsland(char grid[][], int x, int y,int low, int high){
            if(x<0||x>=low || y>=high||y<0 || grid[x][y]!='1'){
                return;
            }
            grid[x][y]='2';
            checkIsland(grid, x-1, y, low, high);
            checkIsland(grid, x, y+1, low, high);
            checkIsland(grid, x+1, y, low, high);
            checkIsland(grid, x, y-1, low, high);
        }
}