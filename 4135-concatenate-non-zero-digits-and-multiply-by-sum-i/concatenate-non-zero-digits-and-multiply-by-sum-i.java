class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder(Integer.toString(n));
        String s="";
        int sum=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                s+=sb.charAt(i)+"";
            }
        }
        if(n==0){
            return 0;
        }
         for(int i=0;i<s.length();i++){
           sum+=s.charAt(i)-'0';
        }
        long num=Long.parseLong(s);
        return (long)sum*num;
    }
}