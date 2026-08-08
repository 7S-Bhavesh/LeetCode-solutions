import java.util.*;
class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();

        int[] rightSide=new int[n+1];
        int j=m-1;
        for(int i=n-1;i>=0;i--){
               rightSide[i]=rightSide[i+1];
            if(j>=0 && word1.charAt(i)==word2.charAt(j)){
                rightSide[i]=rightSide[i+1]+1;
                j--;
            }
           
            
        }
         j=0;
        boolean pow=true;
        int[] ans=new int[n];
        int k=0;
        int i=0;
        while(i<n && j<m){
            if(word1.charAt(i)==word2.charAt(j)){
                ans[k++]=i;
                i++;
                j++;
            }
            else if(pow && rightSide[i+1]>=m-j-1 ){
                ans[k++]=i;
                j++;
                i++;
                pow=false;
            }
           else{
            i++;
        }
        }

    if(j==m) return Arrays.copyOf(ans,m);
    return new int[]{};


    }
}