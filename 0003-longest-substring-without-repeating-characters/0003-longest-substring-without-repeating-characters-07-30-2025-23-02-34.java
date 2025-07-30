class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charset=new int[256];
        int n=s.length(),tail=0, maxLen=0;
        if(n==0||n==1) return n;
        Arrays.fill(charset,0);

        for(int i=0;i<n;i++){
            char current=s.charAt(i);

            while(charset[current]>0){
                charset[(int) s.charAt(tail)]--;
                tail++;
            } 

            charset[current]++;
            maxLen=Math.max(maxLen,i-tail+1);
        }
        return maxLen;
    }
}