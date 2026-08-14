class Solution {
    public int maximumLengthSubstring(String s) {
       int[] freq=new int[26];
        int n=s.length();
        int l=0;
        int max=0;
        for(int i=0;i<n;i++){
          char ch=s.charAt(i);
          freq[ch-'a']++;
          while(freq[ch-'a']>2){
            freq[s.charAt(l)-'a']--;
            l++;
          }
          max=Math.max(max,i-l+1);
        }
        return max;
    }
}