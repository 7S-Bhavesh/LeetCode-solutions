class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}
class StockSpanner {
    // ArrayList<Integer> list;
    Stack<Pair> st=new Stack<>();
   int ind=-1;
    public StockSpanner() {
        // list=new ArrayList<>();
         ind=-1;
        st.clear();  
    }
    
    public int next(int price) {
        ind++;
         int ans=0;
        
         while(!st.isEmpty() && st.peek().f<=price){
            st.pop();
         }
            ans=ind-(st.isEmpty()?-1:st.peek().s);
            st.push(new Pair(price,ind));

         return ans;
        }
        
        
    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */