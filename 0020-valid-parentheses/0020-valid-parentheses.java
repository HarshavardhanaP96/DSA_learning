class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        boolean flag=true;
        int n=s.length();

        for(int i=0;i<n;i++){

            char ch=s.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){

                if(!st.isEmpty() && st.peek()=='(' ){
                    st.pop();
                    continue;
                }else{
                    flag=false;
                    break;
                }

            }
            else if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{' ){
                    st.pop();
                    continue;
                }else{
                    flag=false;
                    break;
                }


            }
            else{
                if(!st.isEmpty() && st.peek()=='[' ){
                    st.pop();
                    continue;
                }else{
                    flag=false;
                    break;
                }

            }

        }

        return flag;

    }
}