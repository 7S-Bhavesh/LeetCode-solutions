class Solution {
    public int minimumDeletions(int[] nums) {
      int n=nums.length;
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int high=-1;
      int low=-1;
      for(int i=0;i<n;i++){
        if(nums[i]>max){
            max=nums[i];
            high=i;
        }
        if(min>nums[i]){
            min=nums[i];
            low=i;
        }
      }
   int leftSum=Math.max(high+1,low+1);
   int rightSum=Math.max(n-high,n-low);
   int tot=Math.min(high+1+(n-low),low+1+(n-high));
   return (int)Math.min(leftSum,Math.min(rightSum,tot));
      

    }
}