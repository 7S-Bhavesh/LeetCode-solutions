class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pref[i]=gcd(max,nums[i]);
        }
        Arrays.sort(pref);
        // System.out.println(Arrays.toString(pref));
        long sum=0;
        for(int i=0;i<n/2;i++){
            
            sum+=gcd(pref[i],pref[n-i-1]);
        }
        return sum;
    }
}