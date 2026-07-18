class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        // HashMap<Character,Integer> map=new HashMap<>();
        int c=0;
        int n=s.length();
        int m=t.length();
        int min=Integer.MAX_VALUE;
        int sidx=-1;
        int cnt=0;
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        for(int r=0;r<n;r++){
         if(map2.getOrDefault(s.charAt(r),0)>0) cnt++;
            map2.put(s.charAt(r), map2.getOrDefault(s.charAt(r), 0) - 1);
           while(cnt==m){
            if(r-l+1<min){
            min=r-l+1;
            sidx=l;
            }
          map2.put(s.charAt(l),map2.getOrDefault(s.charAt(l),0)+1);
          if(map2.get(s.charAt(l))>0) cnt--;
            l++;
           }
           
        }
       
        return sidx==-1?"":s.substring(sidx,min+sidx);
    }
}