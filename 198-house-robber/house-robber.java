class Solution {
    public int f(int[] arr,int ind,int[] dp){
        int n=arr.length;
        if(ind>=n){
            return 0;
        }
        if(ind==n-1){
            return arr[ind];
        }
        if(dp[ind]!=-1) return dp[ind];

        int t=arr[ind]+f(arr,ind+2,dp);
        int nt=f(arr,ind+1,dp);

        return dp[ind]=Math.max(t,nt);
    }
    public int rob(int[] nums) {
            int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(nums,0,dp);
    }
}