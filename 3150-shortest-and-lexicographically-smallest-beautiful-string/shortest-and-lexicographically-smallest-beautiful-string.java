class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int l=0;
        List<String> li=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.containsKey('1') && map.get('1')==k){
                 li.add(s.substring(l,i+1));
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            // System.out.println(map);
           
        }
        // System.out.println(li)
        if(li.isEmpty()) return "";
        String r=li.get(0);
       for(int i=1;i<li.size();i++){
        if(r.length()>li.get(i).length() || (r.length()==li.get(i).length()) && r.compareTo(li.get(i))>0){
            r=li.get(i);
        }
       }
        return r;
    }
}