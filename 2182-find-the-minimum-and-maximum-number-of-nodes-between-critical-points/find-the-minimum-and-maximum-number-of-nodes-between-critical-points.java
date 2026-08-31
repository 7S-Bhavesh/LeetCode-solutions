/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        // List<Integer> mini=new ArrayList<>();
        int[] ans=new int[2];
        List<Integer> maxi=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int n=list.size();
        if(n<=2){
            return new int[]{-1,-1};
        }
        for(int i=1;i<n-1;i++){
            if((list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1) )|| (list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1) )){
                maxi.add(i);
            }
        }
        if(maxi.size()<=1){
              return new int[]{-1,-1};
        }
        Collections.sort(maxi);
        int min=(int)1e9;
      for(int i=1;i<maxi.size();i++){
        min=Math.min(min,maxi.get(i)-maxi.get(i-1));
      }
      ans[0]=min;
      ans[1]=maxi.get(maxi.size()-1)-maxi.get(0);
     
        return ans;
    }
}