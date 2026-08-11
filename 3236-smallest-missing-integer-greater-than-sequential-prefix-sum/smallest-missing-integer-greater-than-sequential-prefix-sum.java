class Solution {
    public int missingInteger(int[] nums) {
        // HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(n==1){
            return nums[0]+1;
        }
        int c=1;
        int sum=nums[0];
        int max=0;
        boolean flag=true;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                c++;
                sum+=nums[i];
                max=Math.max(max,sum);
            }
            else{
                break;
            }
        }
        if(c==1){
            max=nums[0];
        }
        int j=max;
        // System.out.println();
        while(set.contains(j)){
            j++;
        }
      return (j==0)?nums[0]+1:j;
        
        
    }
}