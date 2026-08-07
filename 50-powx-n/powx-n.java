class Solution {
    public double solve(double x,long n){
          if(n==0){
            return 1;
        }
     if(n<0){
        return 1/solve(x,-n);
     }
        double hf=solve(x,n/2);
       
        if (n % 2 == 0) {
            return hf * hf;
        } else {
            return hf * hf * x;
        }
        
    }
    public double myPow(double x, int n) {
      return solve(x,(long)n);
    }
}