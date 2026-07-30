class Solution {
    public int minimumPushes(String word) {
       int n=word.length();
       if(n<=8){
        return n;
       }
     if(n<=16){
        int rem=n%8;
        if(rem==0) rem=8;
        return 8+((int)Math.ceil((double)n/8))*rem;
     }
     if(n<=24){
        int rem=n%8;
      if(rem==0) rem=8;
        return 24+((int)Math.ceil((double)n/8))*rem;
     }
     return 48+4*(n%8);
    }
}