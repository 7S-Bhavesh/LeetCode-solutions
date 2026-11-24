class Solution {
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long lcm(long a, long b) {
    return (a / gcd(a, b)) * b;
}
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=1;
        for(int i=0;i<n;i++){
            long prod=1;
            long gcd1=nums[i];
            long lcm1=nums[i];
            for(int j=i;j<n;j++){
                 gcd1=gcd(gcd1,nums[j]);
                 lcm1=lcm(lcm1,nums[j]);
                 prod*=nums[j];
                if(prod==gcd1*lcm1){
                    max=Math.max(max,j-i+1);
                }


            }
        }
        return max;
    }
}