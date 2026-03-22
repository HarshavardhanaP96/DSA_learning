class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> sTot=new HashMap<>();
        HashMap<Character, Character> tTos=new HashMap<>();


        for(int i=0;i<s.length();i++){

            if(sTot.containsKey(s.charAt(i))){

                if(sTot.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                sTot.put(s.charAt(i),t.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){

            if(tTos.containsKey(t.charAt(i))){

                if(tTos.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else{
                tTos.put(t.charAt(i),s.charAt(i));
            }
        }

        return true;
    }
}