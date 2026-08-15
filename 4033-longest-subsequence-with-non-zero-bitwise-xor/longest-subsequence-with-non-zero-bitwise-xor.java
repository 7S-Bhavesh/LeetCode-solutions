class Solution {
   
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int xor=0;
        int[] zero=new int[n];
            if(Arrays.equals(nums,zero)){
                return 0;
            }
       for(int i:nums){
        xor^=i;
       }
       return (xor!=0)?n:n-1;
    }
}