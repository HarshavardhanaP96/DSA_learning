class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] s1=s.split("\\s+");
        int n=s1.length;
        s="";
        for(int i=n-1;i>=0;i--){
            s=s+s1[i];
            if(i!=0){
                s=s+" ";
            }
        }
        return s;
    }
}