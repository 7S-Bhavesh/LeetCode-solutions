class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxi=Integer.MIN_VALUE;
        if(k==1){
             for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()==1 && maxi<entry.getKey()){
                    maxi=entry.getKey();
                }
            }
            return (maxi==Integer.MIN_VALUE)?-1:maxi;
        }
       else if(k==n){
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if( maxi<entry.getKey()){
                    maxi=entry.getKey();
                }
            }
            return (maxi==Integer.MIN_VALUE)?0:maxi;
        }
        if(nums[0]>nums[n-1]){
            if(map.get(nums[0])==1){
                return nums[0];
            }
            else{
                if(map.get(nums[n-1])==1){
                    return nums[n-1];
                }
                else{
                    return -1;
                }
            }
        }
        else{
            if(map.get(nums[n-1])==1){
                return nums[n-1];
            }
            else{
                if(map.get(nums[0])==1){
                    return nums[0];
                }
                else{
                    return -1;
                }
            }
        }
       
    }
}