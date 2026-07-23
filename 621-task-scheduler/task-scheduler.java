class Solution {
    public int leastInterval(char[] tasks, int n) {
     int[] freq1=new int[26];    
     for(int i=0;i<tasks.length;i++){
        freq1[tasks[i]-'A']++;
     }
     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
     for(int i=0;i<26;i++){
        if(freq1[i]>0) {
        pq.offer(freq1[i]);
        }
     }
     int time=0;
     while(!pq.isEmpty()){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n+1;i++){
            if(!pq.isEmpty()){
            int freq=pq.peek();
            pq.poll();
            freq--;
            list.add(freq);
            }
        }
      for(int i:list){
        if(i>0){
            pq.offer(i);
        }
      }

        

    if(pq.isEmpty()){
        time+=list.size();
    }
    else{
        time+=n+1;
    }

     }
     return time;


    }
}