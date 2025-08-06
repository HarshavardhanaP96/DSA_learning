class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;

        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                System.out.println(haystack.substring(i,i+needle.length()));
                if(needle.equals(haystack.substring(i,i+needle.length()))) return i;
            }
        }

        return -1;
    }
}