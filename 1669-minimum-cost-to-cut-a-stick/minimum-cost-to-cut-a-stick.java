class Solution {
    public int f(int n,int[] arr,int i,int j,int[][] dp){
        if(i>j) return 0;
        int min=(int)1e9;
        if(dp[i][j]!=0) return dp[i][j];
        for(int k=i;k<=j;k++){
            int step=arr[j+1]-arr[i-1]+f(n,arr,i,k-1,dp)+f(n,arr,k+1,j,dp);
            min=Math.min(min,step);

        }
        return dp[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        int c=cuts.length;
        int[] arr=new int[c+2];
        for(int i=1;i<=c;i++){
            arr[i]=cuts[i-1];
        }
        arr[c+1]=n;
        arr[0]=0;
        Arrays.sort(arr);
     int[][] dp=new int[c+1][c+1];
        return f(n,arr,1,c,dp);
    }
}