class Solution {
    public boolean Palind(String s,int l,int r){
      
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int ans=0;
        if(k==1){
            return n;
        }
        for(int i=0;i<=n-k;i++){
            if(Palind(s,i,i+k-1)){
                ans++;
                i+=k-1;
            }
            else if(i<n-k && Palind(s,i,i+k)){
                ans++;
                i+=k;
            }
        }
        return ans;
        
    }
}