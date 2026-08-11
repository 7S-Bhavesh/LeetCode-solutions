class Solution {
    public List<List<Integer>> f(int[] candidates,int target,ArrayList<Integer> list,int ind, List<List<Integer>> l1){
        int n=candidates.length;
     
        if(target==0){
            l1.add(new ArrayList<>(list));
            return l1;
        }
           
        for(int i=ind;i<n;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            list.add(candidates[i]);
            f(candidates,target-candidates[i],list,i+1,l1);
            list.remove(list.size()-1);
        }
   return l1;
       

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l1=new ArrayList<>();
        Arrays.sort(candidates);
        return f(candidates,target,new ArrayList<>(),0,l1);
    }
}