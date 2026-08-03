class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int e=0;
            int od=0;
            for(int j=i;j<n;j++){
                
               if(nums[j]%2==0){
                e++;
               }
               else{
                od++;
               }
               if(e*b<=a*od){
                    ans++;
                }
            }
             
           
        }
        return ans;
    }
}