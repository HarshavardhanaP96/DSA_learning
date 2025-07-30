class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastOccurence=new int[256];
        int n=s.length(),tail=0, maxLen=0;

        if(n==0||n==1) return n;
        Arrays.fill(lastOccurence,-1);

        for(int i=0;i<n;i++){
            char current=s.charAt(i);

            tail=Math.max(tail,lastOccurence[current]);
            maxLen=Math.max(maxLen, i-tail);

            lastOccurence[current]=i;
        }
        return maxLen;
    }
}