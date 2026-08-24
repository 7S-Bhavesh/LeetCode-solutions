class Solution {
      int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    public int f(int[] arr,int ind,boolean turn,int[][] dp){
        int n=arr.length;
        //   int t1 = turn ? 1 : 0;
        
            dp[n-1][1]=arr[n-1];
        
       
            dp[n-1][0]=-arr[n-1];
        
        
       
        // if(dp[ind][t1]!=0) return dp[ind][t1];
        for(int i=n-2;i>=1;i--){
        
            int t=arr[i]+dp[i+1][0];
            int nt=dp[i+1][1];
            max=Math.max(t,nt);
             dp[i][1]=max;
        
       
              t=-arr[i]+dp[i+1][1];
             nt=dp[i+1][0];
            min=Math.min(t,nt);
             dp[i][0]=min;
        
        }
        return dp[1][1];
       
    }
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int[] pref=new int[n];
        pref[0]=stones[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+stones[i];
        }
        int[][] dp=new int[n+1][2];
        System.out.println(Arrays.toString(pref));
        return f(pref,1,true,dp);
    }
}