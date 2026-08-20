class Solution {
    public boolean check(String s1,String s2){
        if(s1.length()!=s2.length()+1) return false;
        int first=0;
        int sec=0;
        while(first<s1.length() && sec<s2.length()){
            if(s1.charAt(first)==s2.charAt(sec)){
                first++;
                sec++;
            }
            else{
                first++;
            }
        }
        if(sec==s2.length()) return true;
        return false;
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(Arrays.toString(words));
        int n=words.length;
        int[] dp=new int[n];
        int maxi=0;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[i],words[j]) && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
            }
        }
        return maxi;
    }
}