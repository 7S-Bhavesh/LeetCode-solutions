class Solution {
    public int f(int i,int j,String s,String t,int[][] dp){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int ta=0;
        if(t.charAt(j)==s.charAt(i)){
            ta=f(i+1,j+1,s,t,dp);
        }
        int nt=f(i+1,j,s,t,dp);
        return dp[i][j]=ta+nt;
    }
    public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int[][] dp=new int[n1][n2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(0,0,s,t,dp);
    }
}