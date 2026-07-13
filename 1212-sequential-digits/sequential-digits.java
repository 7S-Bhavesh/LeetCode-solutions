class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        int n=s.length();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            for(int j=i+1;j<n;j++){
                int val=Integer.parseInt(s.substring(i,j+1));
                if(val>=low && val<=high){
                    list.add(val);
                }
            }
        }
        
         Collections.sort(list);
         return list;
    }
}