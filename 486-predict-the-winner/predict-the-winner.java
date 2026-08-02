class Solution {
    public int f(int[] arr,int i,int j,int sco,boolean turn){
        if(i>j){
            return sco;
        }
        if(turn){
            int t1=f(arr,i+1,j,sco+arr[i],false);
            int t2=f(arr,i,j-1,sco+arr[j],false);
            return Math.max(t1,t2);
        }
        else{
            int t3=f(arr,i+1,j,sco,true);
            int t4=f(arr,i,j-1,sco,true);
            return Math.min(t3,t4);
        }

    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int b=f(nums,0,n-1,0,true);
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int rem=sum-b;
        return b>=rem;
    }
}