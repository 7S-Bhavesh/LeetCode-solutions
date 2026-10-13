class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long sum1=0;
        long sum2=0;
        for(int i=n-1;i>=n/2;i--){
            sum1+=nums[i]*nums[i];
        }
        for(int i=(n/2)-1;i>=0;i--){
            sum2+=nums[i]*nums[i];
        }
        System.out.println(sum2);
        return sum1-sum2;
    }
}