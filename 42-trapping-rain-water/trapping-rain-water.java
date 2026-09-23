class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int lmax=arr[0];
        int rmax=arr[n-1];
        int l=1;
        int res=0;
        int r=n-2;
        while(l<=r){
            if(lmax>=rmax){
                res+=Math.max(0,rmax-arr[r]);

                rmax=Math.max(rmax,arr[r]);

                r--;
            }
            else{
                res+=Math.max(0,lmax-arr[l]);

                lmax=Math.max(lmax,arr[l]);

                l++;
            }
        }
        return res;
    }
}