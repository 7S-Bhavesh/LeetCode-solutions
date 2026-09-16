class Solution {
    public int f(int[] arr,int ind,int target,int[][] dp){
        int n=arr.length;
          if(ind>=n){
            return 0;
    }

    if(target==0){
        return 0;
    }

    if(ind==n-1){
        if(target%arr[ind]==0){
            return target/arr[ind];
        }
        else{
            return (int)1e9;
        }
    }
   if(dp[ind][target]!=-1) return dp[ind][target];
      

    int t=(int)1e9;
    if(target>=arr[ind]){
        t=1+f(arr,ind,target-arr[ind],dp);
    }
    int nt=f(arr,ind+1,target,dp);
    return dp[ind][target]=Math.min(t,nt);
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