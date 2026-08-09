class Solution {
    List<String> li=new ArrayList<>();
    public List<String> solve(StringBuilder curr,int n,int open,int close){
        if(curr.length()==2*n){ 
            li.add(curr.toString());
            return li;
        }
        if(open<n){
           curr.append("(");
            solve(curr,n,open+1,close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
           curr.append(")");
            solve(curr,n,open,close+1);
            curr.deleteCharAt(curr.length()-1);
        }
        return li;
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
       return solve(sb,n,0,0);
    }

    
}