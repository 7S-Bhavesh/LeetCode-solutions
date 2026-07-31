class Solution {
    public String minWindow(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<t.length();i++){
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
       }
       int min=Integer.MAX_VALUE;
       int c=0;
       int m=t.length();
       int n=s.length();
       int sidx=-1;
       int l=0;
       for(int i=0;i<n;i++){
        if(map.getOrDefault(s.charAt(i),0)>0) c++;
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
        while(c==m){
            if(i-l+1<min){
                min=i-l+1;
                sidx=l;
               
            }
            map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)+1);
            if(map.getOrDefault(s.charAt(l),0)>0) c--;
            l++;
        }
       }
       return sidx==-1?"":s.substring(sidx,sidx+min);
        
    }
}