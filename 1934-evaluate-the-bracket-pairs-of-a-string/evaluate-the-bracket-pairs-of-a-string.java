class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n=s.length();
        int l=0;
        StringBuilder sb=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        int i=0;
       while(i<n){
            if(s.charAt(i)=='('){
             int r=i;
                while(s.charAt(r)!=')'){
                    r++;
                }
                String key=s.substring(i+1,r);
                if(map.containsKey(key)){
                    sb.append(map.get(key));
                }
                else{
                    sb.append("?");
                }
            i=r+1;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
    
    return sb.toString();
        

    }
}