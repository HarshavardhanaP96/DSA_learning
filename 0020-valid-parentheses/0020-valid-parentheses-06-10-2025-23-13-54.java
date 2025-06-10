class Solution {
    public boolean isValid(String s) {

        int n=s.length();

        if(n%2!=0) return false;

        Stack<Character> br=new Stack<>();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                br.push(')');
            else if(s.charAt(i)=='{')
                br.push('}');
            else if(s.charAt(i)=='[')
                br.push(']');
            else if(br.isEmpty()||(s.charAt(i)!=br.pop()))
                return false;
        }
        if(!br.isEmpty())
            return false;
        return true;
    }
}