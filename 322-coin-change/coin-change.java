class Solution {
    public int f(int[] arr,int ind,int target,int[][] dp){
        int n=arr.length;

    for(int t=0;t<=target;t++){
           if(t%arr[0]==0){
            dp[0][t]=t/arr[ind];
        }
        else{
             dp[0][t]=(int)1e9;
        }
    }
  
     
    
//    if(dp[ind][target]!=-1) return dp[ind][target];
      

    int t=(int)1e9;
    for(int i=1;i<n;i++){
        for(int tar=0;tar<=target;tar++){
              if(tar>=arr[i]){
        t=1+dp[i][tar-arr[i]];
    }
    int nt=dp[i-1][tar];
     dp[i][tar]=Math.min(t,nt);
        }
    }
    return dp[n-1][target];
  
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return (f(coins,0,amount,dp)==(int)1e9)?-1:f(coins,0,amount,dp);
    }
}