class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
       StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        boolean[] seen=new boolean[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']--;
                if(seen[s.charAt(i)-'a']) continue;
            while(!st.isEmpty() && (st.peek()-'a')>(s.charAt(i)-'a') && freq[st.peek()-'a']>0){
                  
                seen[st.peek()-'a']=false;
                st.pop();
            }
            st.push(s.charAt(i));
            seen[s.charAt(i)-'a']=true;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}