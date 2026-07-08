class Solution {
    public int[] PSE(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() &&  arr[st.peek()]>=arr[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public int[] NSE(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() &&  arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }
    public int largestRectangleArea(int[] heights) {
        int[] pse=PSE(heights);
        int[] nse=NSE(heights);
        int n=heights.length;
        int total=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;


    }
}