class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())return -1;
        int i=0,j=0;
        int pos=-1;
        while(i<needle.length()){

            if(haystack.length()-j<needle.length()-i) return -1;

            if(haystack.charAt(j)!=needle.charAt(i)){
                i=0;
                j++;
            }
            else{
                if(i==0) pos=j;
                i++;
                j++;
            }
        }

        return pos;
    }
}