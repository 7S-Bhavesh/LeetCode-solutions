class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        HashSet<Integer> set2=new HashSet<>(List.of(4,5,6,7));
        
        int n1=reservedSeats.length;
       HashMap<Integer,List<Integer>> map=new HashMap<>();
       for(int i=0;i<n1;i++){
       if(map.containsKey(reservedSeats[i][0])){
        List<Integer> p=map.get(reservedSeats[i][0]);
        p.add(reservedSeats[i][1]);
        map.put(reservedSeats[i][0],p);
       }
       else{
        List<Integer> temp=new ArrayList<>();
        temp.add(reservedSeats[i][1]);
        map.put(reservedSeats[i][0],temp);
       }
       }
       int sum=0;
    for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
        List<Integer> a=entry.getValue();
        HashSet<Integer> set=new HashSet<>(a);
      boolean left=true;
      boolean mid=true;
      boolean right=true;
       
     for(int i=2;i<=5;i++){
        if(set.contains(i)){
        left=false;
        break;
        }
     }
      for(int i=4;i<=7;i++){
        if(set.contains(i)){
        mid=false;
        break;
        }
     }
 for(int i=6;i<=9;i++){
         if(set.contains(i)){
        right=false;
        break;
        }
     }
        if(left && right){
            sum+=2;
        }
        else if(left || right || mid){
            sum+=1;
        }
    }
    sum+=(n-map.size())*2;
    return sum;


    }
}