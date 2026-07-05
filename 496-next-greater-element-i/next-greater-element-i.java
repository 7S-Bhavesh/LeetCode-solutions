class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums2.length;
        int n=nums1.length;
        int[] arr=new int[n1];
        int[] res=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n1-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){ arr[i]=-1;}
            else {arr[i]=st.peek();}
            map.put(nums2[i],i);
            st.push(nums2[i]);
        }
       for(int i=0;i<n;i++){
        res[i]=arr[map.get(nums1[i])];
       }
       System.out.println(Arrays.toString(arr));
    return res;
        
       
      
    }
}