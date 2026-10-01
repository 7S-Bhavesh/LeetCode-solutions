class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int curr=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                curr++;
                res[i]=curr%2;
            }
            else{
                res[i]=curr%2;
                curr--;
            }
        }
        return res;
    
    }
}