class Solution {
   
    public int f(int[] nums,int[] dp){
        int n=nums.length;
      dp[n-1]=0;
        // if(dp[ind][c]!=-1) return dp[ind][c];
         for(int ind=n-2;ind>=0;ind--){
         int ans = Integer.MAX_VALUE;
        for(int i=ind+1;i<=ind+nums[ind] && i <= Math.min(n - 1, ind + nums[ind]);i++){
            int t=dp[i];
              if(t != Integer.MAX_VALUE) {
                    ans = Math.min(ans, t + 1);
                }
        }
        dp[ind]=ans;
         }
        return dp[0];
    }
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        // for(int[] r:dp){
            Arrays.fill(dp,-1);
        
        int ans=f(nums,dp);
        return ans;
    }
}