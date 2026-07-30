class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum-k;
            if(rem==0) c++;
            if(map.containsKey(rem)){
                c+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
       
    }
}