class Pair{
    int r;
    int col;
    public Pair(int r,int c){
        this.r=r;
        this.col=c;
    }
}
class Solution {
    public void bfs(int row,int col,boolean[][] vis,char[][] grid){
         int m=vis.length;
        int n=vis[0].length;
      Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int nr=p.r;
            int nc=p.col;
            for(int k=0;k<4;k++){
                int nrow=nr+drow[k];
                int ncol=nc+dcol[k];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && !vis[nrow][ncol] && grid[nrow][ncol]=='1'){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    bfs(i,j,vis,grid);
                    c++;
                }
            }
        }

        return c;
    }
}