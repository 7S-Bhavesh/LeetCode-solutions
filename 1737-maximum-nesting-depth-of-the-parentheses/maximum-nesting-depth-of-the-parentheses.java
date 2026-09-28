class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
            max=Math.max(max,st.size());
        }
        return max;
    }
}