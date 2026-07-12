import java.util.Arrays;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
       int[] ans=arr.clone();
       Arrays.sort(ans);

       HashMap<Integer,Integer> map=new HashMap<>();
       int r=1;
       for(int i=0;i<n;i++){
        if(!map.containsKey(ans[i])){
            map.put(ans[i],r++);
        }
       }
       for(int i=0;i<n;i++){
        arr[i]=map.get(arr[i]);
       }
       return arr;


    }
}