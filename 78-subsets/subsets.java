class Solution {
    public List<List<Integer>> f(int[] nums,List<List<Integer>> ans,int ind,ArrayList<Integer> list){
        int n=nums.length;
        if(ind==n){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[ind]);
        f(nums,ans,ind+1,list);
        list.remove(list.size()-1);

       f(nums,ans,ind+1,list);
       return ans;
    } 
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        return f(nums,list,0,new ArrayList<>());
    }
}