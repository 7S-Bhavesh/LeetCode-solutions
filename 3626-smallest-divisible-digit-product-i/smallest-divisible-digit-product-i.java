class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=1000;i++){
            int prod=1;
            int val=i;
            while(val>0){
                int rem=val%10;
                prod*=rem;
                val/=10;
            }
            if(prod%t==0){
                return i;
            }
        }
        return -1;
    }
}