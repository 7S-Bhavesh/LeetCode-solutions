class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int num=n;
        int sum=0;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
       if((num%(sum+prod))==0){
        return true;
       }
        return false;   
    }
}