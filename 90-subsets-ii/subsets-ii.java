class Solution {
    public void f(int[] nums,List<Integer> ls,List<List<Integer>> ans,int ind){
        int n=nums.length;
        if(ind==n){
            ans.add(new ArrayList<>(ls));
            return;
        }
    
            ls.add(nums[ind]);
            f(nums,ls,ans,ind+1);
            ls.remove(ls.size()-1);

            while(ind+1<n && nums[ind]==nums[ind+1]){
                ind++;
            }
            f(nums,ls,ans,ind+1);
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        f(nums,new ArrayList<>(),ans,0);
        return ans;
    }
}