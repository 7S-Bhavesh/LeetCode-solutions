class Solution {
    public int f(int[] arr,int ind,int end,int[][] dp){
        int n=arr.length;
        if(ind>end){
            return 0;
        }
        if(dp[ind][end]!=-1) return dp[ind][end];
       
        int t=arr[ind]+f(arr,ind+2,end,dp);
        int nt=f(arr,ind+1,end,dp);
        return dp[ind][end]=Math.max(t,nt);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
  return Math.max(f(nums,0,n-2,dp),f(nums,1,n-1,dp));

   
    


    }
}