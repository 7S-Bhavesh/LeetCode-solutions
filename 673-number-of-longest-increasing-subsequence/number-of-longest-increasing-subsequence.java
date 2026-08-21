class Solution {
   
    public int findNumberOfLIS(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        int[] c=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(c,1);
        int maxi=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] ){
                   if(1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    c[i]=c[j];
                   }
                   else if(1+dp[j]==dp[i]){
                    c[i]+=c[j];
                   }
                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
            }
        }
        int cu=0;
      for(int i=0;i<n;i++){
        if(dp[i]==maxi){
            cu+=c[i];
        }
      }
      return cu;
       
    }
}