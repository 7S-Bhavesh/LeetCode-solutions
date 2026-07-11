class Solution {
     int nodes=0;
     int edgeCount =0;
    public void dfs(List<List<Integer>> adj,int n,int node,boolean[] vis){
        vis[node]=true;
        nodes++;
        edgeCount +=adj.get(node).size();
        for(int i:adj.get(node)){
            if(!vis[i]){
                dfs(adj,n,i,vis);
            }
         
        }
        

    }
    public  int countCompleteComponents(int n, int[][] edges) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];

            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<list.size();i++){
            if(!vis[i]){
             nodes=0;
            edgeCount =0;
               dfs(list,n,i,vis);

             edgeCount  /= 2;

if (edgeCount  == (nodes * (nodes - 1)) / 2) {
    ans++;
}
            }
        }
       
        return ans;
    }
}