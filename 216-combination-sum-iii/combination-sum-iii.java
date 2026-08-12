class Solution {
    public void f(int[] arr,int ind,int k,List<Integer> ls,HashSet<List<Integer>> ans,int n){
        if(k==0 && ls.size()==n){
            ans.add(new ArrayList<>(ls));
        }
        if(ind>=9){
            return ;
        }
       
        ls.add(arr[ind]);
        f(arr,ind+1,k-arr[ind],ls,ans,n);
        ls.remove(ls.size()-1);

        f(arr,ind+1,k,ls,ans,n);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];
        for(int i=0;i<9;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        HashSet<List<Integer>> ans=new HashSet<>();
        f(arr,0,n,new ArrayList<>(),ans,k);
        return new ArrayList<>(ans);
    }
}