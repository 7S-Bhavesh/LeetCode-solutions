class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        int ans=0;
        int dep=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                dep++;
              
            }
            else{
               dep--;
               if(s.charAt(i-1)=='('){
                ans+=1<<dep;
               }
              
                
            }
        }
        return ans;
    }
}