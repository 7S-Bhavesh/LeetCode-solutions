class Solution {
    public int f(int[] arr,int ind,boolean turn,int m,int[][][] dp){
        int n=arr.length;
        if(ind>=n){
            return 0;
        }
        int tindx=(turn?1:0);
          if (dp[ind][m][tindx] != -1) {
            return dp[ind][m][tindx];
        }

        int t=0;
        int nt=0;
        if(turn){
            int sum=0;
            int max=0;
        for(int x=1;x<=2*m && ind+x<=n ;x++){
            sum+=arr[ind+x-1];
           int newM=Math.max(m,x);
            t=sum+f(arr,ind+x,false,newM,dp);

        max=Math.max(max,t);
        }
        return dp[ind][m][tindx]=max;
        }
        else{
           int sum=0;
            int min=Integer.MAX_VALUE;
        for(int x=1;x<=2*m && ind+x<=n ;x++){
            sum+=arr[ind+x-1];
           int newM=Math.max(m,x);
            t=f(arr,ind+x,true,newM,dp);

        min=Math.min(min,t);
        }
        return dp[ind][m][tindx]=min;
        }
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[][][] dp=new int[n][n+1][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return f(piles,0,true,1,dp);
    }
}