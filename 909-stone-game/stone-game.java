class Solution {
    public int f(int[] arr,int i,int j,boolean turn,int sco,int maxi,int[][] dp){
        int n=arr.length;
        if(i>j){
            return sco;
        }
        if(dp[i][j]!=0) return dp[i][j];
        if(turn){
            int t1=f(arr,i+1,j,false,arr[i]+sco,maxi,dp);
            int t2=f(arr,i,j-1,false,arr[j]+sco,maxi,dp);
            dp[i][j]=Math.max(t1,t2);
        }
        else{
            int t3=f(arr,i+1,j,true,sco,maxi,dp);
            int t4=f(arr,i,j-1,true,sco,maxi,dp);
            dp[i][j]=Math.max(t3,t4);
        }
    return dp[i][j];

    }
    public boolean stoneGame(int[] piles) {
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;
        int[][] dp=new int[n+1][n+1];
        int sco=f(piles,0,n-1,true,0,maxi,dp);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=piles[i];
        }
        int b=sum-sco;
        return sco>b;
    }
}