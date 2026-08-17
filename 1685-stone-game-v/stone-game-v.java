class Solution {
    public int f(int[] arr,int i,int j,int[][] dp){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=0) return dp[i][j];
        int sum=0;
        for(int p=i;p<=j;p++){
            sum+=arr[p];
        }
        int leftSum=0;
        int rightSum=0;
        int max=0;
       for(int k=i;k<j;k++){
        leftSum+=arr[k];
        rightSum=sum-leftSum;

        if(leftSum==rightSum){
            int l=leftSum+f(arr,k+1,j,dp);
            int r=rightSum+f(arr,i,k,dp);
            max=Math.max(max,Math.max(l,r));
        }
        else if(leftSum>rightSum){
            max=Math.max(max,rightSum+f(arr,k+1,j,dp));
        }
        else{
           max=Math.max(max,leftSum+f(arr,i,k,dp));
        }
       }
       return dp[i][j]=max;
    }
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int sum=0;
        int[][] dp=new int[n+1][n+1];
        return f(stoneValue,0,n-1,dp);
    }
}