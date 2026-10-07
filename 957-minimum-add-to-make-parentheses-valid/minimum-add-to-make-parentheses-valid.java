class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int open=0;
        int add=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(open>0){
                open--;
            }
            else{
                add++;
            }
        }
        return (int)Math.abs(open)+add;
    }
}