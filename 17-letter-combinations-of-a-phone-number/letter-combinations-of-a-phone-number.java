class Solution {
    String[] map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans=new ArrayList<>();
    public void solve(int idx,String s,StringBuilder temp){
         int n=s.length();
         if(idx>=n){
            ans.add(temp.toString());
            return;
         }
        
            char ch=s.charAt(idx);
            String s1=map[ch-'0'];
            for(int i=0;i<s1.length();i++){
                temp.append(s1.charAt(i));
                solve(idx+1,s,temp);
                temp.deleteCharAt(temp.length()-1);
            }


        }
    
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        StringBuilder sb=new StringBuilder();
       solve(0,digits,sb);
       return ans;

    }
}