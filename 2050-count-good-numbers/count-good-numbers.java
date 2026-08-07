class Solution {
    int mod=(int)1e9+7;
    public long power(long a,long b){
        if(b==0){
            return 1;
        }
        long ha=power(a,b/2);
        long res=(ha*ha)%mod;
       
        if(b%2!=0){
            res=(res*a)%mod;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        int mod=(int)1e9+7;
        // long m=n/2;
        // int ans=1;
        // long prod=1;
        long temp=(long)Math.ceil((double)n/2);
        long  val=(long)n-temp;
        return (int)((power(5,temp)*power(4,val))%mod);
       
    }
}