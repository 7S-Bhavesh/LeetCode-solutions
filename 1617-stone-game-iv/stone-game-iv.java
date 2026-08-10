class Solution {
    public boolean f(int n,boolean turn,boolean[][] dp){
       if(n==0){
        return false;
       }
       if(dp[n][1]) return true;

    for(int i=1;i*i<=n;i++){
        int sq=i*i;
        if(!f(n-sq,!turn,dp)){
            return dp[n][1]=true;
        }
    }
    return dp[n][1]=false;

    }
    public boolean winnerSquareGame(int n) {
        boolean[][] dp=new boolean[n+1][2];
        return  f(n,true,dp);
       
        
    }
}