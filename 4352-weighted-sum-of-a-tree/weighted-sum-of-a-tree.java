

class Solution {
    public long f(int i,int[] parent,long[] depth){
        if(parent[i]==-1){
            return 1;
        }
        if(depth[i]!=0){
            return depth[i];
        }
        return depth[i]=1+f(parent[i],parent,depth);
    }
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
       
        long[] depth=new long[n];
        long ht=1;
        depth[0]=1;
        for(int i=0;i<n;i++){
            if(depth[i]==0){
              f(i,parent,depth);
            }
        ht=Math.max(ht,depth[i]);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i]*(ht-depth[i]+1);
        }
        return sum;
            
        }
    }
