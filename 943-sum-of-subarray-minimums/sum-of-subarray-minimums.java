class Solution {
    public int[] findPSE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            pre[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pre;
    }
    public int[] findNSE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] suff=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            suff[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return suff;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int mod=(int)1e9+7;
        long sum=0;
        int[] psee=findPSE(arr);
        int[] nse=findNSE(arr);
        for(int i=0;i<n;i++){
            int left=i-psee[i];
            int right=nse[i]-i;

           sum = (sum + ((long)left * right % mod) * arr[i] % mod) % mod;
        }
        return (int)sum;
    }
}