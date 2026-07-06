class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> {
    if (a[0] == b[0]) {
        return b[1] - a[1];
    }
    return a[0] - b[0];
});
        int n=intervals.length;
        int prev=intervals[0][1];
        int c=0;
        for(int i=1;i<n;i++){
            if(intervals[i][1]<=prev){
                c++;
            }
            else{
                prev=intervals[i][1];
            }
            System.out.println(prev);
        }
        return n-c;
    }
}