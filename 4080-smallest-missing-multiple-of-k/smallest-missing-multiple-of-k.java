class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int num=k;
      for(int i=1;i<=101;i++){
        if(!set.contains(num*i)){
            return num*i;
        }
      }
      return 1;
    }
}