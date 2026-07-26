class Solution {
    public int maximumProduct(int[] arr) {
        // int product=nums[0];
        // int max_product=nums[0];
        int n=arr.length;
        Arrays.sort(arr);
        return Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[n-1]);
        
        
    }
}