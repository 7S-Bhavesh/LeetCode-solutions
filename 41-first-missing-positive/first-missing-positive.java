class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
      boolean[] s=new boolean[n+1];
     for(int i=0;i<n;i++){
        if(nums[i]>=0 && nums[i]<=n){
            s[nums[i]]=true;
        }
     }
     for(int i=1;i<=n;i++){
        if(!s[i]){
            return i;
        }
     }
     return n+1;

    }
}