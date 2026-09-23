class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int totalsum=0;
       for(int i:nums){
        totalsum+=i;
       }
       int tar=totalsum-x;
       if(tar<0 ) return -1;
       if(tar==0) return n;
       int l=0;
       int ans=-1;
        int sum=0;
       for(int r=0;r<n;r++){
        sum+=nums[r];
        while(l<r && sum>tar){
            sum-=nums[l];
            l++;
        }
        if(sum==tar){
            ans=Math.max(ans,r-l+1);
        }
       }
       return (ans==-1?-1:n-ans);

            
    
        
    }
}