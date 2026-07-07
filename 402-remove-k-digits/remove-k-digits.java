class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();
        if(n==1 && k==1){
            return "0";
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0){
                st.pop();
                k--;
            }
           st.push(num.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        if(k>0){
            while(k!=0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
        }

int i = 0;
while (i < sb.length() && sb.charAt(i) == '0') {
    i++;
}

if (i == sb.length()) {
    return "0";
}
        
       return  sb.substring(i);

    }
}