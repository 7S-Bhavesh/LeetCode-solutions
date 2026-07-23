class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if(n==1 || n==2){
            return n;
        }
        
        int mx = 0;
        for(int num: nums){
            mx = Math.max(mx, num);
        }

        int base = 1;
        while(mx >= base){
            base <<= 1;
        }

        return base;
    }
}