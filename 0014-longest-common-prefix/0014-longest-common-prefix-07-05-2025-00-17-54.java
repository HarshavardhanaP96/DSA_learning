class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String str=strs[0];

        for(String s : strs){

            while(s.indexOf(str)!=0){
                str=str.substring(0,str.length()-1);
            }
            
        }

        return str;
    }
}