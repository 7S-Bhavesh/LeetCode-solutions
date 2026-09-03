class Solution {
    public boolean uniformArray(int[] nums1) {
        // Arrays.sort(nums1);
        int n=nums1.length;
        int minodd=Integer.MAX_VALUE;
        int mineven=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                mineven=Math.min(mineven,nums1[i]);
            }
            else{
                minodd=Math.min(minodd,nums1[i]);
            }
        }
        if(minodd==Integer.MAX_VALUE){
            return true;
        }
        return minodd<mineven;


    }
}