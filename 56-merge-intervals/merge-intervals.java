class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int st=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            else{
                for(int j=i+1;j<n;j++){
                    if(end>=intervals[j][0]){
                        end=Math.max(end,intervals[j][1]);
                    }
                    else{
                        break;
                    }
                }
            }
                    ans.add(Arrays.asList(st,end));
        }
        int[][] ans1=new int[ans.size()][2];
   for(int i = 0; i < ans.size(); i++) {
            ans1[i][0] = ans.get(i).get(0);
            ans1[i][1] = ans.get(i).get(1);
        }


        return ans1;

        

    }
}