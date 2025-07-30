class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1||n==0) return s;

        String res="";
        for (int i = 0; i < n; i++) {
            String s1= palindrome(s,i,i);
            String s2= palindrome(s,i,i+1);

            if(s1.length()>res.length()) res=s1;
            if(s2.length()>res.length()) res=s2;

        }
        return res;

    }

    private String palindrome(String s,int left,int right) {
        while (left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                
            left--;
            right++;
        }
        //substring will not include right or last index hence right instead of right -1 check not needed
        return s.substring(left+1,right);
    }

}