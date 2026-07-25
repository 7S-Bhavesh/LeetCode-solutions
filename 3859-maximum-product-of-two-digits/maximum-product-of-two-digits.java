class Solution {
    public int maxProduct(int n) {
       String s=Integer.toString(n);
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        int n1=ch.length;
        return (int)((ch[n1-1]-'0')*(ch[n1-2]-'0'));


    }
}