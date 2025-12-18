class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();

        int start=0, end=0, ans=0;


        while(end<s.length()){

            if(map.containsKey(s.charAt(end))){
                start=Math.max(start,map.get(s.charAt(end))+1);
            }
            map.put(s.charAt(end),end++);

            ans=Math.max(ans,end-start); //end already increamented

        }
        return ans;

    }
}