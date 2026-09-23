class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-l+1);

        }
        return max;
    }
}