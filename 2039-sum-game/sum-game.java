class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int alice=0;
        int bob=0;
        int sum1=0;
        int sum2=0;
        int q1=0;
        int q2=0;
        for(int i=0;i<=(n/2)-1;i++){
            if(num.charAt(i)=='?'){
                alice++;
                q1++;
            }
            else{
                 sum1+=num.charAt(i)-'0';
            }
        }
         for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                bob++;
                q2++;
            }
            else{
                   sum2+=num.charAt(i)-'0';
            }
        }
         if((q1+q2)%2!=0){
            return true;
        } 
        else if(2*(sum1-sum2)==9*(q2-q1)){
            return false;
        }
        return true;
    }
}