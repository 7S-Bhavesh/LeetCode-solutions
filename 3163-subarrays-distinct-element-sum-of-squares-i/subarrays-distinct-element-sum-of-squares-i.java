class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int l=i;l<=j;l++){
                    if(!set.contains(nums.get(l))){
                        set.add(nums.get(l));
                    }
                }
                sum+=set.size()*set.size();
            set.clear();
            }
        }
        return sum;
    }
}