class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int to=0;
        int pref=height[0];
        int[] suff=new int[n];
        suff[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(suff[i+1],height[i]);
        }
        for(int i=1;i<n;i++){
            pref=Math.max(pref,height[i]);

           if(pref>height[i] && suff[i]>height[i]){
            to+=Math.min(pref,suff[i])-height[i];
           }
        }
        return to;
    }
}