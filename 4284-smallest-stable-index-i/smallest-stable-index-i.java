class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pref=new int[n];
        int[] suff=new int[n];
        Arrays.fill(suff,Integer.MAX_VALUE);
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=Math.max(pref[i-1],nums[i]);
        }
        suff[n-1]=nums[n-1];
          for(int i=n-2;i>=0;i--){
            suff[i]=Math.min(suff[i+1],nums[i]);
        }
        System.out.println(Arrays.toString(suff));
        for(int i=0;i<n;i++){
            if(pref[i]-suff[i]<=k){
                return i;
            }
        }
        return -1;
    }
}