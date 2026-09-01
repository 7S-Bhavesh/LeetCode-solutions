import java.util.*;

class Pair{ 
    int row; 
    int col; 
    int energy; 
    int step; 
    int mask; 

    public Pair(int row,int col,int step,int ele,int mask){ 
        this.row=row; 
        this.col=col; 
        this.energy=ele; 
        this.step=step; 
        this.mask=mask; 
    } 
} 

class Solution { 
    public int minMoves(String[] classroom, int energy) { 

        int m=classroom.length; 
        int n=classroom[0].length(); 

        char[][] grid=new char[m][n]; 

        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){ 
                grid[i][j]=classroom[i].charAt(j); 
            } 
        } 

        int[][] litterId=new int[m][n]; 

        for(int[] row:litterId){ 
            Arrays.fill(row,-1); 
        } 

        int sr=0; 
        int sc=0; 
        int total=0; 

        for(int i=0;i<m;i++){  
            for(int j=0;j<n;j++){  

                if(grid[i][j]=='L'){  
                    litterId[i][j]=total;  
                    total++;  
                }  

                else if(grid[i][j]=='S'){  
                    sr=i; 
                    sc=j; 
                }  
            }     
        } 

        Queue<Pair> q=new LinkedList<>(); 

        boolean[][][][] vis=
            new boolean[m][n][1<<total][energy+1]; 

        q.offer(new Pair(sr,sc,0,energy,0)); 

        vis[sr][sc][0][energy]=true; 

        int[] delrow={-1,0,1,0}; 
        int[] delcol={0,1,0,-1}; 

        int finalMask=(1<<total)-1; 

        while(!q.isEmpty()){ 

            Pair p=q.poll(); 

            int row=p.row; 
            int col=p.col; 
            int step=p.step; 
            int mask=p.mask; 
            int ene=p.energy; 

            if(mask==finalMask){ 
                return step;         
            } 

            if(ene==0){ 
                continue; 
            } 

            for(int k=0;k<4;k++){ 

                int nr=row+delrow[k]; 
                int nc=col+delcol[k]; 

                if(nr>=0 && nr<m &&
                   nc>=0 && nc<n &&
                   grid[nr][nc]!='X'){ 

                    int newE=ene-1; 
                    int newM=mask; 

                    if(grid[nr][nc]=='R'){ 
                        newE=energy; 
                    } 

                    if(grid[nr][nc]=='L'){ 
                        int id=litterId[nr][nc]; 
                        newM=mask | (1<<id); 
                    } 

                    if(!vis[nr][nc][newM][newE]){ 

                      
                        q.offer(
                            new Pair(
                                nr,
                                nc,
                                step+1,
                                newE,
                                newM
                            )
                        ); 

                     
                        vis[nr][nc][newM][newE]=true; 
                    } 
                } 
            } 
        } 

        return -1; 
    } 
}