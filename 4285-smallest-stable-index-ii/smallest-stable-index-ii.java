class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] suff=new int[n];
        Arrays.fill(suff,Integer.MAX_VALUE);
        suff[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(nums[i],suff[i+1]);
        }
        int max=0;
        System.out.println(Arrays.toString(suff));
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-suff[i]<=k){
                return i;
            }
        }
        return -1;
    }
}