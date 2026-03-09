class Solution {
    public String reverseWords(String s) {
        String[] s2=s.split("\\s+");

        StringBuilder ans=new StringBuilder();

        for(int i=s2.length-1;i>=0;i--){
            ans.append(s2[i]).append(" ");
        }

        return ans.toString().trim();
    }
}