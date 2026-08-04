class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        min=Math.min(min,nums[i]);
        max=Math.max(max,nums[i]);
       }
        for(int i:nums){
            set.add(i);
        }

       for(int i=min;i<=max;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
        return list;
    }
}