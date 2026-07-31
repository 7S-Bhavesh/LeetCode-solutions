class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] f=new int[26];
        int sum=0;
        for(int i=0;i<n;i++){
            f[word.charAt(i)-'a']++;
        }
        Arrays.sort(f);
        int[] so=new int[26];
        for(int i=0;i<26;i++){
            so[i]=f[25-i];
        }

        for(int i=0;i<26;i++){
            if(so[i]==0){
                break;
            }
            else{
                sum+=((i/8)+1)*so[i];
            }

        }
        return sum;
        
      
        
    }
}