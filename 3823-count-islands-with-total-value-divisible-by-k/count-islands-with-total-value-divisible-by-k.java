class Pair{
    int r;
    int c;
    public Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {

    public long bfs(int[][] grid,boolean[][] vis,int sr,int sc){
        Queue<Pair> q=new LinkedList<>();
           int n=grid.length;
        int m=grid[0].length;
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        
        q.add(new Pair(sr,sc));
        vis[sr][sc]=true;
        long sum=0;
        while(!q.isEmpty()){
            Pair p=q.peek();
            int row=p.r;
            int col=p.c;
             sum+=grid[row][col];
             q.poll();
            for(int k=0;k<4;k++){
                int nr=row+dr[k];
                int nc=col+dc[k];

                if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && grid[nr][nc]>0){
                    
                    q.add(new Pair(nr,nc));
                    vis[nr][nc]=true;
                }
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]>0){
                
                if(!vis[i][j] && (bfs(grid,vis,i,j))%k==0){
                    ans++;
                }
               }
            }
        }
    return ans;
    }
}