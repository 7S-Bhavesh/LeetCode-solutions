class Solution {
    public int sub(int[] nums,int k){
          int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int l=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
            
                 map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            
            }
                c+=i-l+1;
            
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return sub(nums,k)-sub(nums,k-1);
    }
}