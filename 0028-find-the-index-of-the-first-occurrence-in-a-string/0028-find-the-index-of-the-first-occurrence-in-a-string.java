class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(m==0||n==0||haystack==null||needle==null||n>m) return -1;

        int i=haystack.indexOf(needle);

        return i;

    }
}